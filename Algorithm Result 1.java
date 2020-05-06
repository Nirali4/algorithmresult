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

public class EMA extends Indicator { 
    URL url = new URL("https://www.cryptonator.com/api/currencies");
 private final int length; 
 private final double multiplier; 
 
 public EMA(final QuoteHistory qh, final int length) { 
  super(qh); 
  this.length = length; 
  multiplier = 2. / (length + 1.); 
 } 
 
 @Override 
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
  value = ema; 
 
  return value; 
 } 
}
