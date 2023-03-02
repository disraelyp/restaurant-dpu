package com.disraely.exceptions.services;

public class EntityNotFoundException extends RuntimeException {
  public EntityNotFoundException() {
    super("Entity not found");
  }
}
