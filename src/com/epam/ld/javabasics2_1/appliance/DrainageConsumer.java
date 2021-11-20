package com.epam.ld.javabasics2_1.appliance;

import java.io.OutputStream;

public interface DrainageConsumer {
    public void connectToDrainage(OutputStream drainage);
}
