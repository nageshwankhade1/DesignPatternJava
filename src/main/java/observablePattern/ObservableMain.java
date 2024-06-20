package observablePattern;

import observablePattern.observable.IphoneObservableImpl;
import observablePattern.observable.StockObservable;
import observablePattern.observer.EmailNotificationObserverImpl;
import observablePattern.observer.NotificationAlertObserver;
import observablePattern.observer.SmsNotificationObserverImpl;

public class ObservableMain {
    public static void main(String[] args) {

        StockObservable iphoneObservable = new IphoneObservableImpl();

        NotificationAlertObserver emailNotificationObserver1 = new EmailNotificationObserverImpl("nagesh@gmail.com", iphoneObservable);
        NotificationAlertObserver emailNotificationObserver2 = new EmailNotificationObserverImpl("amey@gmail.com", iphoneObservable);
        NotificationAlertObserver smsNotificationObserver3 = new SmsNotificationObserverImpl("90111", iphoneObservable);

        iphoneObservable.add(emailNotificationObserver1);
        iphoneObservable.add(emailNotificationObserver2);
        iphoneObservable.add(smsNotificationObserver3);

        iphoneObservable.setStockCount(10);


    }
}
