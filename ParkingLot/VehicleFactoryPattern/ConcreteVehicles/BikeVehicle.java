package ParkingLot.VehicleFactoryPattern.ConcreteVehicles;

import ParkingLot.FareStrategyPattern.ParkingFeeStrategy;
import ParkingLot.VehicleFactoryPattern.Vehicle;

public class BikeVehicle extends Vehicle{
    public BikeVehicle(String licensePlate,String vehicleType,ParkingFeeStrategy feesStrategy){
        super(licensePlate,vehicleType,feesStrategy);
    }
}