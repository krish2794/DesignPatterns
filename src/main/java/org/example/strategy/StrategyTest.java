package org.example.strategy;

import org.example.strategy.strategies.HDDisplay;
import org.example.strategy.strategies.NormalDisplay;
import org.example.strategy.strategies.SportsDriveStartegy;

public class StrategyTest {
    public static void main(String[] args){
        Vehicle vehicle = new SportsVehicle(new HDDisplay(), new SportsDriveStartegy());
        System.out.println("----Sports vehicle----");
        vehicle.drive();
        vehicle.display();

        Vehicle vehicle2 = new OffRoadVehicle(new NormalDisplay(), new SportsDriveStartegy());
        System.out.println("----OffRoad vehicle----");
        vehicle2.drive();
        vehicle2.display();
    }
}
