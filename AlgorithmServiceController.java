package com.g4.fauxexchange.api;

import com.g4.fauxexchange.model.Result;
import com.g4.fauxexchange.model.AlgorithmResult;
import com.g4.fauxexchange.model.Price;

import com.g4.fauxexchange.service.AlgorithmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlgorithmServiceController {
    
    @Autowired
    private AlgorithmService algorithmService;
    public double value;

    @RequestMapping(value = "/api/algorithm", method = RequestMethod.GET)
    public ResponseEntity<Object> getAlgorithm() {
        return new ResponseEntity<Object>(algorithmService.runResult(value), HttpStatus.OK);
    }

    @RequestMapping(value = "/name/result/list of prices", method = RequestMethod.GET)
    public ResponseEntity<Object> getAlgorithmByCode(@PathVariable("result") final Double result) {
        return new ResponseEntity<Object>(algorithmService.runResult(result), HttpStatus.OK);
    }

}