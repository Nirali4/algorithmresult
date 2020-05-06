package com.g4.fauxexchange.dao;

import java.util.List;

import com.g4.fauxexchange.AlgorithmResult;
import com.g4.fauxexchange.model.AlgorithmResult;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AlgorithmResultRepository extends MongoRepository<Algorithm, String> {
    @Query(value = "{ 'code': ?0 }", fields="{ 'name': 1, 'code': 1, 'price': 1 }")
	Currency findByCode(String Price);

    @Query(value = "{}", fields="{ 'name': 1, 'code': 1, 'price': { $slice: -1 } }")
    List<AlgorithmResult> findAllWithRecentPrices();

}