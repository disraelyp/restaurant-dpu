package com.disraely.entities;

import java.util.List;

public class Tax extends BaseEntity {
  private String description;
  private Double taxPercentage;
  private List<OrderDetailTax> orderDetailTaxList;

  public Tax() {}

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Double getTaxPercentage() {
    return taxPercentage;
  }

  public void setTaxPercentage(Double taxPercentage) {
    this.taxPercentage = taxPercentage;
  }

  public List<OrderDetailTax> getOrderDetailTaxList() {
    return orderDetailTaxList;
  }

  public void setOrderDetailTaxList(List<OrderDetailTax> orderDetailTaxList) {
    this.orderDetailTaxList = orderDetailTaxList;
  }
}
