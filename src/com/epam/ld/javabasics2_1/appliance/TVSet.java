package com.epam.ld.javabasics2_1.appliance;

import java.io.InputStream;

public class TVSet extends AbstractAppliance implements PowerConsumer {

    private String typeTV;

    public String getTypeTV() {
        return typeTV;
    }

    public void setTypeTV(String typeTV) {
        this.typeTV = typeTV;
    }

    public TVSet() {
        super();
    }

    public TVSet(String name, Double price, Integer lifeTimeMonths, String typeTV) {
        super(name, price, lifeTimeMonths);
        this.typeTV = typeTV;
    }

    @Override
    public String info() {
        return String.format("TV{name=%s | price=%g | lifeTime=%d months | typeTV=%s}", getName(), getPrice(), getLifeTimeMonths(), getTypeTV());
    }

    @Override
    public void plugToPowerLine(InputStream powerSource) {

    }
}
