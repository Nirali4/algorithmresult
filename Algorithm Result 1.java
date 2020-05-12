package com.g4.fauxexchange.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;

import com.g4.fauxexchange.service.AlgorithmService;
import com.g4.fauxexchange.model.AlgorithmResult;

import java.net.URL;
import java.util.List; 
 
import org.lifeform.market.PriceBar; 
import org.lifeform.market.QuoteHistory; 
 
/**
 * Exponential Moving Average. 
 */ 

public class AlgorithmResult extends Indicator { 
    URL url = new URL("https://www.cryptonator.com/api/currencies");
 private final int length; 
 private final double multiplier; 
 
 // representation of the result //
 @Override
    public String toString() {
        return String.format("Result[projectedprice='%f', time='%d']", result, time);
    }

 public Result(final QuoteHistory qh, final int length) {  
  this.length = length; 
  multiplier = 2. / (length + 1.); 
 } 
 
 public double calculate() { 
     final List<PriceBar> priceBars = qh.getAll();
     final int lastBar = priceBars.size() - 1;
     final int firstBar = lastBar - 2 * length + 1;
     double ema = priceBars.get(firstBar).getClose();

     for (int bar = firstBar; bar <= lastBar; bar++) {
         final double barClose = priceBars.get(bar).getClose();
   ema += (barClose - ema) * multiplier; 
  } 
 // the value should be shown//
  value = result; 
 
  return result; 
  
 } 

// Getters and Setters //
public String getResult() {
    return this.result;
}

public long getTime() {
    return this.time;
}

public void setTime(long time) {
    this.time = time;
}

public long getProjectedprice() {
    return this.projectedprice;
}

public void setProjectedprice(long projectedprice) {
    this.projectedprice = projectedprice;
}



// updating the result //
public void update(final Result result) {
    if(!this.result.isEmpty()) {
        result.setChange(result.getValue() - this.result.peekLast().getValue());
        this.result.add(price);
    }  
}
}