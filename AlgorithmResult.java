package com.g4.fauxexchange.model;

import java.sql.Time;
import java.util.LinkedList;

import com.g4.fauxexchange.model.Result;
import com.g4.fauxexchange.model.Price;
import com.g4.fauxexchange.model.Currency;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

 
/**
 * Exponential Moving Average. 
 */ 
@Document
public class AlgorithmResult { 

    @Id
    public String Result;
    public String currency;
    public long Time;

    public AlgorithmResult() {
    }

    public AlgorithmResult(final Double result, final String currency) {
        this.result = Result;
        this.Currency = currency;
        this.result = new LinkedList<Result>();
    }

    private static double Result;

    public double multiplier;
    public double result;
    public long length;
    public long length2;
    public double FirstBar;
    public double LastBar;
    public double Bar;
    public double ProjectedPrice;
    private list<priceBar> priceBar;
    private QuoteHistory qh;
    public long time;
    public double BarClose;

    // representation of the result //
    // @Override
    public Double toDouble() {
        System.out.Println("Result = [projectedprice='%f', time='%d']", Result, Time);
    }

    public void Result(final QuoteHistory qh, final long time) {
        final long length2 = length;
        this.length = length2;
        multiplier = 2. / (length2 + 1.);
    }

    // price bar is imported //
    // @Override
    public double calculate() {
        Object qh;
        double LastBar = PriceBar.size() - 1;
        double FirstBar = LastBar - 2 * Time + 1;
        double Result = PriceBar.get(FirstBar).getClose();

       for (double Bar = FirstBar; Bar <= LastBar; Bar++) {
            double BarClose = PriceBar.get(Bar).getClose();
            Result = (BarClose - Result) * multiplier;
        }

        double value = result;
        System.out.Println("Value = Result");
    

    // Getters and Setters //

    public double getResult() {
       return this.result;

    public void setResult(double result) {
        this.Result = result;

    public long getTime() {
        return this.Time;
    }

    public void setTime(long time) {
        this.time = Time;
    }

    public double getProjectedprice() {
        return this.getprojectedprice;
    }

    public void setProjectedprice(Double projectedprice) {
    }

    // updating the result //
    public void update(Result result) {
        if (!this.result.isEmpty()) {
         this.result.add(Result);
    }  
}


// Return the most recent result
public double Result() {
  return this.result.peekLast().getValue();
  
    }
}