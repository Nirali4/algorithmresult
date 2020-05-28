package main.java.com.g4.fauxexchange.model;
import java.util.LinkedList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


public class Time {
    public long second;
    public long first; 
    public long Time;
    public double value;

 public Time( long time, double value) { 
  //super(time, value); 
  System.out.println("Time: , Value: ");
 }
 
 public long getTime() { 
  return first; 
 } 
 
 public double getValue() { 
  return second;
 } 
}
