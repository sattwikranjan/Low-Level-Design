package StrategyDesignPattern.WithStrategyPattern;

public class Main {
    public static void main(String[] args) {
        Vehicle goodsVehicle = new GoodsVehicle();
        goodsVehicle.drive();

        Vehicle sportsVehicle = new SportsVehicle();
        sportsVehicle.drive();

        Vehicle offRoadVehicle = new OffRoadVehicle();
        offRoadVehicle.drive();
    }
}