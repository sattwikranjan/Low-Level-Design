package ParkingLot.VehicleFactoryPattern.ConcreteVehicles;

import ParkingLot.FareStrategyPattern.ParkingFeeStrategy;
import ParkingLot.VehicleFactoryPattern.Vehicle;

public class OtherVehicle extends Vehicle{
    public OtherVehicle(String licensePlate,String vehicleType,ParkingFeeStrategy feesStrategy){
        super(licensePlate,vehicleType,feesStrategy);
    }
}