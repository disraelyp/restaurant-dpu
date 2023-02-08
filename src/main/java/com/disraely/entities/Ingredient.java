package com.disraely.entities;

import com.disraely.enums.MeasureUnit;

public class Ingredient extends BaseEntity {
    private String name;
    private Double cost;
    private MeasureUnit measureUnit;

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

    public MeasureUnit getMeasurementUnits() {
        return measureUnit;
    }

    public void setMeasurementUnits(MeasureUnit measurementUnits) {
        this.measureUnit = measurementUnits;
    }
}
