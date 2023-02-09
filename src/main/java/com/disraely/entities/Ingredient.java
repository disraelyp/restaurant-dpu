package com.disraely.entities;

import com.disraely.enums.MeasureUnit;

import java.util.List;

public class Ingredient extends BaseEntity {
    private String name;
    private Double cost;
    private MeasureUnit measureUnit;
    private List<StockIngredient> stockIngredients;

    public Ingredient() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public MeasureUnit getMeasureUnit() {
        return measureUnit;
    }

    public void setMeasureUnit(MeasureUnit measureUnit) {
        this.measureUnit = measureUnit;
    }

    public List<StockIngredient> getStockIngredients() {
        return stockIngredients;
    }

    public void setStockIngredients(List<StockIngredient> stockIngredients) {
        this.stockIngredients = stockIngredients;
    }
}
