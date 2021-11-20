package com.epam.ld.javabasics2_1.appliance;

import java.io.InputStream;

public class Owen extends AbstractAppliance implements PowerConsumer {

    public Owen() {
        super();
    }

    public Owen(String name, Double price, Integer lifeTimeMonths) {
        super(name, price, lifeTimeMonths);
    }

    @Override
    public String info() {
        return String.format("Owen{name=%s | price=%g | lifeTime=%d months}", getName(), getPrice(), getLifeTimeMonths());
    }

    @Override
    public void plugToPowerLine(InputStream powerSource) {

    }
}
