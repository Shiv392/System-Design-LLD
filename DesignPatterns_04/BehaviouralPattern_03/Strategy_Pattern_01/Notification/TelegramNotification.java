package DesignPatterns_04.BehaviouralPattern_03.Strategy_Pattern_01.Notification;

public class TelegramNotification implements NotificationStrategy {
    @Override
    public void notify(String message){
        System.out.println("Telegram Notification......"+message);
    }
}
