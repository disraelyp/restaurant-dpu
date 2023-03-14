package com.disraely.services;

import com.disraely.entities.BaseEntity;
import com.disraely.enums.EntityStatus;
import com.disraely.interfaces.IBaseService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BaseService<E extends BaseEntity> implements IBaseService<E> {

    protected final List<E> entities;
    protected final Class<E> entityClass;

    public BaseService(Class<E> entityClass) {
        this.entities = new ArrayList<E>();
        this.entityClass = entityClass;
    }

    @Override
    public Optional<E> findOneById(long id) {
        return Optional.empty();
    }

    @Override
    public List<E> find() {
        return this.entities
                .stream()
                .filter(e -> e.getStatus() != EntityStatus.DELETED)
                .toList();
    }

    @Override
    public boolean delete(long id) {
        return false;
    }

    @Override
    public E update(E entity) {
        return null;
    }

    @Override
    public E create(E entity) {
        return null;
    }
}
