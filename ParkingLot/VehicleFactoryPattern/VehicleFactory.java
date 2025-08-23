package ParkingLot.VehicleFactoryPattern;

import ParkingLot.FareStrategyPattern.ParkingFeeStrategy;
import ParkingLot.VehicleFactoryPattern.ConcreteVehicles.CarVehicle;
import ParkingLot.VehicleFactoryPattern.ConcreteVehicles.BikeVehicle;
import ParkingLot.VehicleFactoryPattern.ConcreteVehicles.OtherVehicle;

public abstract class VehicleFactory{
    public static Vehicle createVehicle(String vehicleType,String licensePlate,ParkingFeeStrategy feesStrategy){
        if(vehicleType.equalsIgnoreCase("Car")){
            return new CarVehicle(licensePlate,vehicleType,feesStrategy);
        }
        else if(vehicleType.equalsIgnoreCase("Bike")){
            return new BikeVehicle(licensePlate,vehicleType,feesStrategy);
        }
        return new OtherVehicle(licensePlate,vehicleType,feesStrategy);
    }
}