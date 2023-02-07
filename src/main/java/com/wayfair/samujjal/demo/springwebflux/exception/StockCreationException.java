package com.wayfair.samujjal.demo.springwebflux.exception;

public class StockCreationException extends RuntimeException {

  public StockCreationException(String message) {
    super(message);
  }
}
