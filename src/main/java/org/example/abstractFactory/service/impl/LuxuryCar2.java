package org.example.abstractFactory.service.impl;

import org.example.abstractFactory.service.Car;

public class LuxuryCar2 implements Car {
    @Override
    public int getTopSpeed() {
        return 250;
    }
}
