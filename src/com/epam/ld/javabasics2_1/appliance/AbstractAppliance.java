package com.epam.ld.javabasics2_1.appliance;

import java.util.Objects;

public abstract class AbstractAppliance {

    private String name;
    private Double price;
    private Integer lifeTimeMonths;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getLifeTimeMonths() {
        return lifeTimeMonths;
    }

    public void setLifeTimeMonths(Integer lifeTimeMonths) {
        this.lifeTimeMonths = lifeTimeMonths;
    }

    public AbstractAppliance() {
    }

    public AbstractAppliance(String name, Double price, Integer lifeTimeMonths) {
        this.name = name;
        this.price = price;
        this.lifeTimeMonths = lifeTimeMonths;
    }

    public String info() {
        return String.format("{name=%s | price=%g | lifeTime=%d months}", name, price, lifeTimeMonths);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractAppliance appliance = (AbstractAppliance) o;
        return Objects.equals(getName(), appliance.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}
