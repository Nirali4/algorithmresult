package com.g4.fauxexchange.model;
import java.util.LinkedList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

public class QuoteHistory { 
 
    // private list<priceBar> priceBar;
 public String validationMessage; 
 public  String Name; 
 
 public QuoteHistory(String Name) { 
  // priceBar = new arrayList<PriceBar>(); 
  //validationMessage = new arrayList<String>();  
 } 
 
 public QuoteHistory() { 
 } 
  
// public list<priceBar> getAll() { 
//  return priceBar; 
 } 
 
