package main.java.com.g4.fauxexchange.model;
import java.util.LinkedList;

import com.g4.fauxexchange.model.Price;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

public class Quote { 
 public enum Type { 
  Yield, Price, Future, Spread, Average 
 } 
 
 protected Type type; 
 protected double value; 
 protected long date; 
 
 public Quote(Type type, double price) { 
  this.type = type; 
  this.value = price; 
 } 
 
 public long getDate() { 
  return date; 
 } 
 
 public void setDate(long date) { 
  this.date = date; 
 } 
 
 public void setValue(double value) { 
  this.value = value; 
 } 
 
 public Type getType() { 
  return type; 
 } 
 
 public void setType(Type type) { 
  this.type = type; 
 } 
 
 public double getValue() { 
  return value; 
 } 
 
 public void setValue(float value) { 
  this.value = value; 
 } 
}
