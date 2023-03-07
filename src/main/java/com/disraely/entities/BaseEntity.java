package com.disraely.entities;

import com.disraely.enums.EntityStatus;
import java.time.Instant;

public abstract class BaseEntity {
  private Long id;
  private Instant createDate;
  private Instant updateDate;
  private EntityStatus status;

  public BaseEntity() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Instant getCreateDate() {
    return createDate;
  }

  public void setCreateDate(Instant createDate) {
    this.createDate = createDate;
  }

  public Instant getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(Instant updateDate) {
    this.updateDate = updateDate;
  }

  public EntityStatus getStatus() {
    return status;
  }

  public void setStatus(EntityStatus status) {
    this.status = status;
  }
}
