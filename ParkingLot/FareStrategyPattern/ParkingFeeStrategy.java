package ParkingLot.FareStrategyPattern;

import ParkingLot.CommonEnum.DurationType;

public interface ParkingFeeStrategy{
    double calculateFee(String vehicleType,int duration,DurationType durationType);
}