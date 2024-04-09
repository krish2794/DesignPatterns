package org.example.abstractFactory.service.impl;

import org.example.abstractFactory.service.Car;

public class EconomyCar2 implements Car {
    @Override
    public int getTopSpeed() {
        return 120;
    }
}
