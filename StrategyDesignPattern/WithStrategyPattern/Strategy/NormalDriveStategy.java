package StrategyDesignPattern.WithStrategyPattern.Strategy;

public class NormalDriveStategy implements DriveStrategy {
    @Override
    public void drive() {
        // some code for the normal drive capabilities
        System.out.println("Normal drive capability");
    }
}
