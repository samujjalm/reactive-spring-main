package com.wayfair.samujjal.demo.springwebflux.repository;

import com.wayfair.samujjal.demo.springwebflux.model.Stock;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StocksRepository extends ReactiveMongoRepository<Stock, String> {
}
