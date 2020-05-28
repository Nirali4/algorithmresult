package main.java.com.g4.fauxexchange.model;
import java.util.LinkedList;

import com.g4.fauxexchange.model.Price;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

public class PriceBar { 
  public double price2;

 public PriceBar(double price) { 
 // super(price, price); 
 } 
 
 public PriceBar(double high, double low, double close) { 
 // super(high, low, close); 
 } 
 
 public PriceBar(long date, double high, double low, double close) { 
  //super(high, low, close); 
 } 
}