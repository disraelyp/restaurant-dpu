package com.disraely.entities;

public class ProductIngredient extends BaseEntity {
  private Product product;
  private Ingredient ingredient;
  private Double quantity;

  public ProductIngredient() {
    super();
  }

  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  public Ingredient getIngredient() {
    return ingredient;
  }

  public void setIngredient(Ingredient ingredient) {
    this.ingredient = ingredient;
  }

  public Double getQuantity() {
    return quantity;
  }

  public void setQuantity(Double quantity) {
    this.quantity = quantity;
  }
}
