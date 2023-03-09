package com.disraely.entities;

import com.disraely.enums.ProductCategory;
import java.util.List;

public class Product extends BaseEntity {
  private String name;
  private String description;
  private Double price;
  private ProductCategory category;
  private List<ProductIngredient> productIngredientList;
  private List<OrderDetailProduct> orderDetailProductList;

  public Product() {
    super();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public ProductCategory getCategory() {
    return category;
  }

  public void setCategory(ProductCategory category) {
    this.category = category;
  }

  public List<ProductIngredient> getProductIngredientList() {
    return productIngredientList;
  }

  public void setProductIngredientList(List<ProductIngredient> productIngredientList) {
    this.productIngredientList = productIngredientList;
  }

  public List<OrderDetailProduct> getOrderDetailProductList() {
    return orderDetailProductList;
  }

  public void setOrderDetailProductList(List<OrderDetailProduct> orderDetailProductList) {
    this.orderDetailProductList = orderDetailProductList;
  }
}
