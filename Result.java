package com.g4.fauxexchange.model;

import java.util.LinkedList;

import com.g4.fauxexchange.model.Currency;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

public class Result {
		public double Result;
		String currency;
		long time;
		private LinkedList<Result> result;

	public Result(){}
	public Result(double result) {
		this.Result = result;
		// this.Currency = currency;
		this.result = new LinkedList<Result>();
	}
	@Override
		public String toString() {
	   return String.format ("Result[projectedprice='%f', time='%d']", result, time) ;
	   //System.out.Println ("Result:");
	}


	public static void update(Result result) {
	}
		


// Getters and Setters //

	public double getResult() {
		return this.Result;
}

	public double setResult(double result) {
		return result;   
	this.result = Result;
}

	public long getTime() {
		return this.time;
	}
   
	public void setTime(final long time) {
		this.time = time;
	}
   
	public double getProjectedprice() {
		return this.getProjectedprice();
	}
   
	public void setProjectedprice(final double projectedprice) {
	   }

}


