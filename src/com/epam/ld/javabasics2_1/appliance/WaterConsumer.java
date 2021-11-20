package com.epam.ld.javabasics2_1.appliance;

import java.io.InputStream;

public interface WaterConsumer {
    public void connectToWaterLine(InputStream waterSource);
}
