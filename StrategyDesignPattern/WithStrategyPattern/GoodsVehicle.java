package StrategyDesignPattern.WithStrategyPattern;

import StrategyDesignPattern.WithStrategyPattern.Strategy.NormalDriveStategy;

public class GoodsVehicle extends Vehicle {
    GoodsVehicle() {
        super(new NormalDriveStategy());
    }
}