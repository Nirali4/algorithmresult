package com.g4.fauxexchange.model;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.apache.commons.io.IOUtils;
import org.json.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.g4.fauxexchange.model.AlgorithmResult;
import com.g4.fauxexchange.dao.AlgorithmRepository;

@SpringBootApplication
@EnableScheduling
public class Algorithm implements CommandLineRunner {

    @Autowired
    private Algorithm repository; 
class ExponentialMovingAverage {
    URL url = new URL("https://www.cryptonator.com/api/currencies");
    private final double alpha;
    private Double oldValue;
	private final double alpha2;

    public ExponentialMovingAverage(final double alpha) {
        alpha2 = alpha;
		this.alpha = alpha;
    }

    public double average(final double value) {
        if (oldValue == null) {
            oldValue = value;
            return value;
        }
         // the value should be shown//
        final double newValue = oldValue + alpha * (value - oldValue);
        oldValue = newValue;
        return newValue;
    }
}

    
