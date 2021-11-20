package com.epam.ld.javabasics2_1.appliance;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ApplianceTest {

    @Test
    public void test() {
        List<AbstractAppliance> appliances = new ArrayList<>();
        appliances.add(new Dishwasher("Bosch 65737463", 890.0, 36));
        appliances.add(new TVSet("Samsung U6537", 3490.0, 24, "QLED"));
        appliances.add(new TVSet("Горизонт 15\" ЧБ", 349.0, 12, "Black/White"));
        appliances.add(new Fridge("Атлант 365", 690.0, 18));
        appliances.add(new Fridge("SMEG", 15890.0, 36));
        appliances.add(new Owen("Electrolux 74748", 390.0, 36));

        System.out.println("All appliances");
        appliances.stream().map(AbstractAppliance::info).forEach(System.out::println);
        System.out.println();

        assertTrue(appliances.contains(new Fridge("Атлант 365", 0.0, 0)));

        System.out.println("Appliances with price between 500 and 5000");
        appliances.stream().filter(a -> a.getPrice()>500 && a.getPrice()<5000).map(AbstractAppliance::info).forEach(System.out::println);

    }

}
