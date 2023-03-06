package com.disraely.exceptions.ioc;

public class ValueNullPointerException extends RuntimeException {
    public ValueNullPointerException() {
        super("The value can not be null.");
    }
}
