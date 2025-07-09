package Observer.Stocks;

import Observer.Stocks.Observable.IphoneStock;
import Observer.Stocks.Observer.MobileAlert;
import Observer.Stocks.Observer.EmailAlert;
public class Main {
    public static void main(String[] args){
        IphoneStock iphoneStock=new IphoneStock();
        MobileAlert observer1 =new MobileAlert("ancss12@gmail.com", iphoneStock);
        EmailAlert observer2=new EmailAlert("Anchal", iphoneStock);
        MobileAlert observer3 =new MobileAlert("anc12@gmail.com", iphoneStock);

        iphoneStock.getStockCount();
        iphoneStock.setStockCount(20);
        iphoneStock.getStockCount();
        iphoneStock.setStockCount(-20);
    }
}
