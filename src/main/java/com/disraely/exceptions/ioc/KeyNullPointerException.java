package com.disraely.exceptions.ioc;

public class KeyNullPointerException extends RuntimeException {
    public KeyNullPointerException() {
        super("The Key can not be null");
    }
}
