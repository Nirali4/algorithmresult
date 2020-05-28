package com.g4.fauxexchange.model;
import java.util.LinkedList;

import com.g4.fauxexchange.model.QuoteHistory;
import com.g4.fauxexchange.model.Currency;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


public abstract class Indicator { 
 public double value; 
 public QuoteHistory qh; 
 public double History;
 public String currency;
  
 public abstract double calculate();
 
 public Indicator() { 
 // History = new arrayList<indicator>(); 
    } 
 
 public Indicator( QuoteHistory qh) { 
  this(); 
  this.qh = qh; 
    } 
 
 //@Override 
 public Double toDouble() { 
    System.out.println("Value: ") ;
    return History;
    } 
 
 public double getValue() { 
  return value; 
    } 
 
 
 public void addToHistory( double value) {  
    } 
 
 public double getHistory() { 
  return History; 
    } 
}
