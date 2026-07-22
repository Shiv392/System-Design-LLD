package DesignPatterns_04.BehaviouralPattern_03.Strategy_Pattern_01.Notification;

public class WhatsappNotification implements NotificationStrategy{
    @Override
    public void notify(String message){
        System.out.println("Whatsapp notification...."+message);
    }
}
