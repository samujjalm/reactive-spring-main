package com.wayfair.samujjal.demo.springwebflux.controller;

import com.wayfair.samujjal.demo.springwebflux.model.Stock;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/stocks")
public class StocksController {

  @GetMapping("/{id}")
  public Mono<Stock> getOneStock(@PathVariable String id) {
    return Mono.just(Stock.builder().name("stock - " + id).build());
  }

  @GetMapping
  public Flux<Stock> getStocks() {
    return Flux.range(1, 5)
        .map(counter -> Stock.builder().name("stock - " + counter).build());
  }
}
