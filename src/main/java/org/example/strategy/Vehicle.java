package org.example.strategy;

import org.example.strategy.strategy.DisplayStrategy;
import org.example.strategy.strategy.DriveStrategy;

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
