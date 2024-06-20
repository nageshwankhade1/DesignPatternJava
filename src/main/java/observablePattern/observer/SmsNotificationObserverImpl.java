package observablePattern.observer;

import observablePattern.observable.StockObservable;

public class SmsNotificationObserverImpl implements NotificationAlertObserver{
    String MobileNo;
    StockObservable stockObservable;

    public SmsNotificationObserverImpl(String mobileNo, StockObservable stockObservable) {
        MobileNo = mobileNo;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendSms(this.MobileNo,"product in a stock");
    }

    private void sendSms(String mobileNo, String msg){
        System.out.println("Sent SmS :- "+ mobileNo);
    }
}
