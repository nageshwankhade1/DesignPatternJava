package observablePattern.observable;

import observablePattern.observer.NotificationAlertObserver;

public interface StockObservable {

    void add(NotificationAlertObserver notificationAlertObserver);

    void remove(NotificationAlertObserver notificationAlertObserver);

    void notifySubscriber();

    void setStockCount(int count);

    int getStockCount();


}
