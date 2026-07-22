package DesignPatterns_04.BehaviouralPattern_03.Strategy_Pattern_01.Notification;

public class NotificationService {

    NotificationStrategy notificationStrategy;

    NotificationService(NotificationStrategy _NotificationStrategy){
        notificationStrategy = _NotificationStrategy;
    }
    
    public void notify(String message){
        notificationStrategy.notify(message);
    }
}
