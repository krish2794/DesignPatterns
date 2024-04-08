package org.example.strategy;

import org.example.strategy.strategies.DisplayStrategy;
import org.example.strategy.strategies.DriveStrategy;

public class Vehicle {

    DriveStrategy driveStrategy;
    DisplayStrategy displayStrategy;

    Vehicle(DisplayStrategy displayStrategy, DriveStrategy driveStrategy){
        this.displayStrategy = displayStrategy;
        this.driveStrategy = driveStrategy;
    }

    public void drive(){
        driveStrategy.drive();
    }

    public void display(){
        displayStrategy.display();
    }
}
