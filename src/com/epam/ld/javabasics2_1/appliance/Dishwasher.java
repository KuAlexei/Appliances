package com.epam.ld.javabasics2_1.appliance;

import java.io.InputStream;
import java.io.OutputStream;

public class Dishwasher extends AbstractAppliance implements DrainageConsumer, PowerConsumer, WaterConsumer {

    public Dishwasher() {
        super();
    }

    public Dishwasher(String name, Double price, Integer lifeTimeMonths) {
        super(name, price, lifeTimeMonths);
    }

    @Override
    public String info() {
        return String.format("Dishwasher{name=%s | price=%g | lifeTime=%d months}", getName(), getPrice(), getLifeTimeMonths());
    }

    @Override
    public void connectToDrainage(OutputStream drainage) {

    }

    @Override
    public void plugToPowerLine(InputStream powerSource) {

    }

    @Override
    public void connectToWaterLine(InputStream waterSource) {

    }
}
