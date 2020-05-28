package com.g4.fauxexchange.model;

import java.util.Date;
import java.time.Instant;
import java.text.SimpleDateFormat;

public class Price {


   public double change;
    public long time;
    public double value;
    public double alpha; 
    public double period;
    public double price; 
    public Price() {}

    public Price( double value,  double period) {
        this.value = value;
        this.change = 0.0;
        this.time = Instant.now().getEpochSecond();
        this.alpha = 2.0 / (period + 1.0);
        System.out.println("Price:");
    }

    //@Override
    public void reset() {
        System.out.println("Price:");
    }

    //@Override
    public double calculate() {
         value += alpha * (price - value);
        System.out.println("Price:");
        return price;

    }

    //@Override
    public String toString() {
        return String.format("Price[value='%f', change='%f', time='%d']", value, change, time);
    }

    // Getters & Setters

    public double getValue() {
        return this.value;
    }

    public void setValue( double value) {
        this.value = value;
    }

    public double getChange() {
        return this.change;
    }

    public void setChange(double change) {
        this.change = change;
    }

    public long getTime() {
        return this.time;
    }

    public void setTime( long time) {
        this.time = time;
    }

}
    