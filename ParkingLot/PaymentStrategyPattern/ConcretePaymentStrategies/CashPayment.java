package ParkingLot.PaymentStrategyPattern.ConcretePaymentStrategies;

import ParkingLot.PaymentStrategyPattern.PaymentStrategy;

public class CashPayment implements PaymentStrategy{
    public CashPayment(double fee){

    }

    @Override
    public void processPayment(double amount){
        System.out.println("Processing cash payment of $ "+ amount);
    }
}