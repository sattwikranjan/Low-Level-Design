package ParkingLot.PaymentStrategyPattern.ConcretePaymentStrategies;

import ParkingLot.PaymentStrategyPattern.PaymentStrategy;

public class CreditCardPayment implements PaymentStrategy{
    public CreditCardPayment(double fee){

    }

    @Override
    public void processPayment(double amount){
        System.out.println("Processing credit card payment of $ "+ amount);
    }
}