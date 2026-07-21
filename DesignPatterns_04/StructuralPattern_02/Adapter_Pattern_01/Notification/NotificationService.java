package DesignPatterns_04.StructuralPattern_02.Adapter_Pattern_01.Notification;

public class NotificationService implements NotificationInterface {
    public void notify(String message){
        System.out.println("Message from Notification service: "+message);
    }
}
