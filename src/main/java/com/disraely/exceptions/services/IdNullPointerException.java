package com.disraely.exceptions.services;

public class IdNullPointerException extends RuntimeException {
  public IdNullPointerException() {
    super("The id can not be null");
  }
}
