package StrategyDesignPattern.WithStrategyPattern.Strategy;

public class SportsDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        // It has its special method & different drive logic
        System.out.println("Sports Drive Capability");
    }
}
