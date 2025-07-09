package Observer.Stocks.Observable;

import Observer.Stocks.Observer.NotificationAlertObserver;

public interface StockStatus {
    public void add(NotificationAlertObserver observer);
    public void remove(NotificationAlertObserver observer);
    public void notifySubscriber();
    public void setStockCount(int newStockAdded);
    public int getStockCount();
}
