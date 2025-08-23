package ParkingLot.VehicleFactoryPattern;

import ParkingLot.CommonEnum.DurationType;
import ParkingLot.FareStrategyPattern.ParkingFeeStrategy;

public abstract class Vehicle{

    private String licensePlate;
    private String vehicleType;
    private ParkingFeeStrategy feesStrategy;
    public Vehicle(String licensePlate,String vehicleType,ParkingFeeStrategy feesStrategy){
        this.licensePlate=licensePlate;
        this.vehicleType=vehicleType;
        this.feesStrategy=feesStrategy;
    }

    public String getVehicleType(){
        return vehicleType;
    }
    public String getLicensePlate(){
        return licensePlate;
    }

    public double calculateFee(int duration,DurationType durationType){
        return feesStrategy.calculateFee(vehicleType,duration,durationType);
    }
}