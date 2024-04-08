package org.example.strategy;

import org.example.strategy.strategies.DisplayStrategy;
import org.example.strategy.strategies.DriveStrategy;

public class SportsVehicle extends Vehicle{
    public SportsVehicle(DisplayStrategy displayStrategy, DriveStrategy driveStrategy){
        super(displayStrategy, driveStrategy);
    }
}
