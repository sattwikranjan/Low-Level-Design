package Observer.Stocks.Observer;

import Observer.Stocks.Observable.IphoneStock;
public class EmailAlert implements NotificationAlertObserver{
    String emailId;
    private IphoneStock iphoneStock;

    public EmailAlert(String emailId,IphoneStock iphoneStock){
        this.iphoneStock=iphoneStock;
        this.emailId=emailId;
        iphoneStock.add(this);
    }

    public void update(){
        sendSMS(emailId, "Product is in stock now, so hurry up!");
    }

    public void sendSMS(String emailId, String msg){
        System.out.println("SMS has been sent to the user: " + emailId + " with the message: " + msg);
    }
}