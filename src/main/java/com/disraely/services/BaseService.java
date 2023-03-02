package com.disraely.services;

import com.disraely.entities.BaseEntity;
import com.disraely.enums.EntityStatus;
import com.disraely.exceptions.services.EntityNotFoundException;
import com.disraely.exceptions.services.EntityNullPointerException;
import com.disraely.exceptions.services.IdNullPointerException;
import com.disraely.interfaces.IBaseService;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BaseService<E extends BaseEntity> implements IBaseService<E> {

  protected final List<E> entities;
  protected final Class<E> entityClass;
  protected long currentId;

  public BaseService(Class<E> entityClass) {
    this.entities = new ArrayList<E>();
    this.entityClass = entityClass;
  }

  @Override
  public Optional<E> findOneById(long id) {
    Optional.ofNullable(id).orElseThrow(IdNullPointerException::new);
    return this.entities.stream()
        .filter(e -> e.getStatus() != EntityStatus.DELETED && e.getId() == id)
        .findFirst();
  }

  @Override
  public List<E> find() {
    return this.entities.stream().filter(e -> e.getStatus() != EntityStatus.DELETED).toList();
  }

  @Override
  public E delete(long id) {
    var entity = this.findOneById(id).orElseThrow(EntityNotFoundException::new);
    entity.setStatus(EntityStatus.DELETED);
    return update(entity);
  }

  @Override
  public E update(E entity) throws EntityNullPointerException {
    Optional.ofNullable(entity).orElseThrow(EntityNullPointerException::new);
    var storageEntity = this.findOneById(entity.getId()).orElseThrow(EntityNotFoundException::new);
    storageEntity.setUpdateDate(Instant.now());
    return storageEntity;
  }

  @Override
  public E create(E entity) {
    Optional.ofNullable(entity).orElseThrow(EntityNullPointerException::new);
    entity.setStatus(EntityStatus.ACTIVE);
    entity.setId(currentId);
    entity.setCreateDate(Instant.now());
    entity.setUpdateDate(Instant.now());
    this.currentId++;
    this.entities.add(entity);
    return entity;
  }
}
