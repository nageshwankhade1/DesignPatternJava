package observablePattern.observer;

import observablePattern.observable.StockObservable;

public class EmailNotificationObserverImpl implements NotificationAlertObserver{

    String emailId;
    StockObservable stockObservable;

    public EmailNotificationObserverImpl(String emailId, StockObservable stockObservable) {
        this.emailId = emailId;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendMail(this.emailId, "product in a stock");
    }

    private void sendMail(String emailId, String msg){
        System.out.println("Mail sent to mail id: - "+ emailId);
    }
}
