package com.disraely.ioc;

import com.disraely.exceptions.ioc.DuplicatedKeyException;
import com.disraely.exceptions.ioc.KeyNotFoundException;
import com.disraely.exceptions.ioc.KeyNullPointerException;
import com.disraely.exceptions.ioc.ValueNullPointerException;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Ioc {
    public static Ioc instance;
    public static Map<String, Object> instances = new HashMap<>();

    public Ioc() {
    }

    public static Ioc getInstance() {
        return Optional.ofNullable(instance).orElseGet(Ioc::new);
    }

    public void add(String key, Object value) {
        var optionalKey = Optional.ofNullable(key);
        optionalKey.orElseThrow(KeyNullPointerException::new);
        Optional.ofNullable(value).orElseThrow(ValueNullPointerException::new);

        var validatedKey = optionalKey
                .filter(k -> !instances.containsKey(k))
                .orElseThrow(DuplicatedKeyException::new);

        instances.put(validatedKey, value);
    }

    public <T> T get(String key) {
        var optionalKey = Optional.ofNullable(key);
        optionalKey.orElseThrow(KeyNullPointerException::new);

        var validatedKey = optionalKey
                .filter(instances::containsKey)
                .orElseThrow(KeyNotFoundException::new);

        return (T) instances.get(validatedKey);
    }

}