package com.g4.fauxexchange.dao;

import java.util.List;

import com.g4.fauxexchange.AlgorithmResult;
import com.g4.fauxexchange.model.AlgorithmResult;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AlgorithmResultRepository extends MongoRepository<Algorithm, Double> {
    @Query(value = "{ 'code': ?0 }", fields="{ 'results': 1, 'price': 1 }")
	Algorithm findByCode(Double Result);

    @Query(value = "{}", fields="{ 'results': 1, 'price': { $slice: -1 } }")
    List<Result> findAllWithRecentPrices();

    
        InventoryRepository repo = context
     .getMethod(AlgorithmRepository.class);
 
        AlgorithmResult result = new MAlgorithmResult(
                result = repo.saveresult()) ;

}
