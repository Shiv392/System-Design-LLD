package DesignPatterns_04.BehaviouralPattern_03.Strategy_Pattern_01.Notification;

public class EmailNotification implements NotificationStrategy{
    @Override
    public void notify(String message){
        System.out.println("Email notification......"+message);
    }
}
