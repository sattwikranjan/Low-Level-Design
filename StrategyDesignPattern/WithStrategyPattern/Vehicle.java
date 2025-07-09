package StrategyDesignPattern.WithStrategyPattern;

import StrategyDesignPattern.WithStrategyPattern.Strategy.DriveStrategy;
import StrategyDesignPattern.WithStrategyPattern.Strategy.NormalDriveStategy;

public class Vehicle {

    DriveStrategy driveStrategy;

    Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        // Delegate the driving capability to the strategy
        driveStrategy.drive();
    }
}