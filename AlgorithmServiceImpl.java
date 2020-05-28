package com.g4.fauxexchange.service.impl;

import java.util.List;
import java.net.URL;

import org.springframework.stereotype.Service;

import jdk.nashorn.internal.runtime.JSONFunctions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.apache.commons.io.IOUtils;
import org.json.*;

import com.g4.fauxexchange.model.AlgorithmResult;
import com.g4.fauxexchange.model.Result;
import com.g4.fauxexchange.service.AlgorithmService;
import com.g4.fauxexchange.dao.AlgorithmRepository;

@Service
public class AlgorithmServiceImpl implements AlgorithmService {

      @Autowired
    private  AlgorithmRepository algorithmRepository;

            Object json;
            public double result;
           
    //@Override
     public void showResult(Result result) {
         algorithmRepository.save(result);
     }

     // updating the algorithm with this functions /R
    // @Override
     @Schedule(fixedRate = 60000, initialDelay = 70000)
     public void updateResult() {
         System.out.println("- Updating Result -");
         for ( Result result : algorithmRepository.findAll()) {
              JSONObject json = null;
             try {
                 System.setProperty("http.agent", "curl/7.51.0");
                 json = new JSONObject(IOUtils.toString(new URL("https://api.cryptonator.com/api/ticker/" + result.getResult() + "-AUD")));
             } catch (final Exception e) {
                 e.printStackTrace();
             }
             System.out.println("Updated: " + result);
         }

         try {
             if (json!= null) {
              //   double resultAPI = json.getJSONObject("ticker").getDouble("result");
                //Result result  = new Result(resultAPI);
                 //Result.update(result);
                 // AlgorithmRepository.save(new Result(resultAPI));
             }
         } catch (JSONException je) {
             je.printStackTrace();
         }

         System.out.println("Updated: " + result);
     }

     /* Get All results for the currencies */

     //@Override
     public void result(Result result) {
         System.out.println("Result");
     }

    // @Override
     public void updateResult( double result) {
         System.out.println("Update Result");
     }

     //@Override
     public List<Result> getResult() {
        //return Algorithmrepository.FindAllRecentResults();
     }

    // @Override
     public Result getResult(double result) {
      //  return algorithmrepository.findByResult(result);
        }
    }