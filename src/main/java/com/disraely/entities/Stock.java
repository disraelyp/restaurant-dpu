package com.disraely.entities;

import java.util.List;

public class Stock extends BaseEntity {
  private String description;
  private List<StockIngredient> stockIngredients;

  public Stock() {
    super();
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public List<StockIngredient> getStockIngredients() {
    return stockIngredients;
  }

  public void setStockIngredients(List<StockIngredient> stockIngredients) {
    this.stockIngredients = stockIngredients;
  }
}
