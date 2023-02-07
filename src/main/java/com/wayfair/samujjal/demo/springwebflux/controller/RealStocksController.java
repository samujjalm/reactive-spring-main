package com.wayfair.samujjal.demo.springwebflux.controller;

import com.wayfair.samujjal.demo.springwebflux.dto.StockRequest;
import com.wayfair.samujjal.demo.springwebflux.dto.StockResponse;
import com.wayfair.samujjal.demo.springwebflux.service.StocksService;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
@RestController
@RequestMapping("/scalablestocks")
public class RealStocksController {
  private StocksService stocksService;

  @GetMapping("/{id}")
  public Mono<StockResponse> getOneStock(@PathVariable String id) {
    return stocksService.getOneStock(id);
  }

  @GetMapping
  public Flux<StockResponse> getAllStocks(
      @RequestParam(required = false, defaultValue = "0")
      BigDecimal priceGreaterThan) {
    return stocksService.getAllStocks(priceGreaterThan);
  }

  @PostMapping
  public Mono<StockResponse> createStock(@RequestBody StockRequest stock) {
    return stocksService.createStock(stock);
  }
}
