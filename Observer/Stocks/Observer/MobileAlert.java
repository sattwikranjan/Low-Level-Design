package Observer.Stocks.Observer;

import Observer.Stocks.Observable.IphoneStock;
public class MobileAlert implements NotificationAlertObserver{
    String userName;
    private IphoneStock iphoneStock;

    public MobileAlert(String userName,IphoneStock iphoneStock){
        this.iphoneStock=iphoneStock;
        this.userName=userName;
        iphoneStock.add(this);
    }

    public void update(){
        sendSMS(userName, "Product is in stock now, so hurry up!");
    }

    public void sendSMS(String userName, String msg){
        System.out.println("SMS has been sent to the user: " + userName + " with the message: " + msg);
    }
}