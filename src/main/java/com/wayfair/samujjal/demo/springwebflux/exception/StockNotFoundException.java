package com.wayfair.samujjal.demo.springwebflux.exception;

public class StockNotFoundException extends RuntimeException {

  public StockNotFoundException(String message) {
    super(message);
  }
}
