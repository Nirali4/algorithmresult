package com.g4.fauxexchange.dao;

import java.util.List;

import com.g4.fauxexchange.model.AlgorithmResult;
import com.g4.fauxexchange.model.Result;
import com.g4.fauxexchange.model.Price;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AlgorithmRepository extends MongoRepository<Result, Double> {

    @Query(value = "{ 'code': ?0 }", fields = "{ 'results': 1, 'price': 1 }")
	Result findByCode(Double Result);

    @Query(value = "{}", fields="{ 'results': 1, 'price': { $slice: -1 } }")
	static List<Result> FindAllRecentResults() {
    }
     
        // Result result = new Result();
        // Result saveresult();
         //static void saveAll(Object result) {
            //return List<Result> Result;
        

 }
    

            

