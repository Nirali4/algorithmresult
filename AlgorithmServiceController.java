package com.g4.fauxexchange.api;

import com.g4.fauxexchange.service.AlgorithmService;
import com.g4.fauxexchange.model.AlgorithmResult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlgorithmServiceController {
    @Autowired
    private AlgorithService algorithmService;


    @RequestMapping(value = "/api/algorithm", method = RequestMethod.GET)
    public ResponseEntity<Object> getAlgorithm() {
        return new ResponseEntity<Object>(algorithmService.getAlgorithm(), HttpStatus.OK);
    }


    @RequestMapping(value = "/api/algorithm/{code}", method = RequestMethod.GET)
    public ResponseEntity<Object> getAlgorithmByCode(@PathVariable("code") final String code) {
        return new ResponseEntity<Object>(algorithmService.getAlgorithm(code), HttpStatus.OK);
    }

}