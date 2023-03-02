package com.disraely.interfaces;

import java.util.List;
import java.util.Optional;

public interface IBaseService<E> {
    Optional<E> findOneById(long id);
    List<E> find();
    boolean delete(long id);
    E update(E entity);
    E create(E entity);
}
