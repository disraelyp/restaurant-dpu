package com.disraely.exceptions.ioc;

public class KeyNotFoundException extends RuntimeException {
  public KeyNotFoundException() {
    super("The Key not found");
  }
}
