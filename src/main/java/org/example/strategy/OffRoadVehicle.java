package org.example.strategy;

import org.example.strategy.strategies.DisplayStrategy;
import org.example.strategy.strategies.DriveStrategy;

public class OffRoadVehicle extends Vehicle{
    OffRoadVehicle(DisplayStrategy displayStrategy, DriveStrategy driveStrategy){
        super(displayStrategy, driveStrategy);
    }
}
