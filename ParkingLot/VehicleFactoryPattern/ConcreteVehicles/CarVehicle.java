package ParkingLot.VehicleFactoryPattern.ConcreteVehicles;

import ParkingLot.FareStrategyPattern.ParkingFeeStrategy;
import ParkingLot.VehicleFactoryPattern.Vehicle;

public class CarVehicle extends Vehicle{
    public CarVehicle(String licensePlate,String vehicleType,ParkingFeeStrategy feesStrategy){
        super(licensePlate,vehicleType,feesStrategy);
    }
}