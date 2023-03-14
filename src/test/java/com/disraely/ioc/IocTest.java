package com.disraely.ioc;

import com.disraely.exceptions.ioc.DuplicatedKeyException;
import com.disraely.exceptions.ioc.KeyNotFoundException;
import com.disraely.exceptions.ioc.KeyNullPointerException;
import com.disraely.exceptions.ioc.ValueNullPointerException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IocTest {
  private Ioc ioc = null;

  @BeforeEach
  public void initEach() {
    ioc = Ioc.getInstance();
  }

  @Test
  public void testAddAndGet() {
    var key = "key1";
    var value = "value1";
    ioc.add(key, value);
    Assertions.assertEquals(value, ioc.get(key));
  }

  @Test
  public void testAddDuplicateKeyThrowsException() {
    var key = "key";
    var value = "value";
    ioc.add(key, value);
    Assertions.assertThrows(DuplicatedKeyException.class, () -> ioc.add(key, value));
  }

  @Test
  public void testAddNullKeyThrowsException() {
    var value = "value";
    Assertions.assertThrows(KeyNullPointerException.class, () -> ioc.add(null, value));
  }

  @Test
  public void testAddNullValueThrowsException() {
    var key = "key";
    Assertions.assertThrows(ValueNullPointerException.class, () -> ioc.add(key, null));
  }

  @Test
  public void testGetNonexistentKeyThrowsException() {
    var key = "anotherKey";
    Assertions.assertThrows(KeyNotFoundException.class, () -> ioc.get(key));
  }

  @Test
  public void testGetWithNullKeyThrowsException() {
    Assertions.assertThrows(KeyNullPointerException.class, () -> ioc.get(null));
  }
}
