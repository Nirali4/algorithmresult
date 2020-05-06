package com.g4.fauxexchange.service.impl;

import java.util.List;
import java.net.URL;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.apache.commons.io.IOUtils;
import org.json.*;

import com.g4.fauxexchange.model.Algorithm;
import com.g4.fauxexchange.model.Price;
import com.g4.fauxexchange.service.AlgorithmService;
import com.g4.fauxexchange.dao.AlgorithmRepository;


@Service
public class AlgorithmServiceImpl implements AlgorithmService {
    @Override
    private AlgorithmRepsitory algorithmRepsoitory;
    @Override
    public void runAlgorithmResult(final Algorithm algorithm) {
        AlgorithmRepository.save(algorithmresult);
    }
    @Override
    @Schedule(fixedRate=60000, initialDelay = 60000)
    public void updateResult() {
        System.out.println("- Algorithm value -")
        for(final Algorithm algorithm : algorithmRepository.findAll()) {
        final JSONObject json = null;
        try {
            System.setProperty("http.agent", "curl/7.51.0");
            IOUtils.toString(
                new URL("https://api.cryptonator.com/api/ticker/"+ Algorithm.getResult() + "-AUD"));
    } catch(final Exception e) {
         e.printStackTrace();
    }
    try{
        if(json != null) {
            final double priceAPI = json.getJSONObject("ticker").getDouble("price");
            final Price price = new Price(priceAPI);
            Algorithm.update(price);
            AlgorithmRepository.save(Algorithm);
        }
    } catch(final JSONException je) {
        je.printStackTrace();
    }

    System.out.println("Updated: " + currency);
            }
        
    
    }
