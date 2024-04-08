package org.example.strategy;

import org.example.strategy.strategy.DisplayStrategy;
import org.example.strategy.strategy.DriveStrategy;
import org.example.strategy.strategy.SportsDriveStartegy;

public class SportsVehicle extends Vehicle{
    public SportsVehicle(DisplayStrategy displayStrategy, DriveStrategy driveStrategy){
        super(displayStrategy, driveStrategy);
    }
}
