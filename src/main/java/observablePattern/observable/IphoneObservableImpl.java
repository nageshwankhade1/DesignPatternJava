package observablePattern.observable;

import observablePattern.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StockObservable{
    List<NotificationAlertObserver> observerList = new ArrayList<>();
    static int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver notificationAlertObserver) {
        observerList.add(notificationAlertObserver);
    }

    @Override
    public void remove(NotificationAlertObserver notificationAlertObserver) {
        observerList.remove(notificationAlertObserver);
    }

    @Override
    public void notifySubscriber() {
        for(NotificationAlertObserver alertObserver : observerList){
            alertObserver.update();
        }
    }

    @Override
    public void setStockCount(int newStockCountAdded) {
        if(stockCount==0){
            notifySubscriber();
        }
        stockCount = stockCount + newStockCountAdded;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
