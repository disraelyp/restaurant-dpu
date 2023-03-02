package com.disraely.exceptions.services;

public class EntityNullPointerException extends RuntimeException {
  public EntityNullPointerException() {
    super("The entity can not be null");
  }
}
