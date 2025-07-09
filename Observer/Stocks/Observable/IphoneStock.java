package Observer.Stocks.Observable;

import java.util.*;
import Observer.Stocks.Observer.NotificationAlertObserver;
import Observer.Stocks.Observer.NotificationAlertObserver;

public class IphoneStock implements StockStatus{
    private List<NotificationAlertObserver> observers;
    private int stockCount;
    public IphoneStock(){
        observers=new ArrayList<NotificationAlertObserver>();
    }

    public void add(NotificationAlertObserver observer){
        observers.add(observer);
    }

    public void remove(NotificationAlertObserver observer){
        observers.remove(observer);
    }

    public void notifySubscriber(){
        for(NotificationAlertObserver observer:observers){
            observer.update();
        }
    }
     public void setStockCount(int newStockAdded) {
        if(stockCount == 0){
            notifySubscriber();
        }
        stockCount = stockCount + newStockAdded;
        System.out.println(stockCount);

    }
    @Override
    public int getStockCount() {
        System.out.println(stockCount);
        return stockCount;
    }
}