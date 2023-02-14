package com.disraely.entities;

public abstract class BaseEmployee extends BasePerson {
    private int level;

    public BaseEmployee() {
        super();
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
