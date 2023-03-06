package com.disraely.exceptions.ioc;

public class DuplicatedKeyException extends RuntimeException {
    public DuplicatedKeyException() {
        super("The Key already exists");
    }
}
