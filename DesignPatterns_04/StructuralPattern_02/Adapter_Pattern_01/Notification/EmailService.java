package DesignPatterns_04.StructuralPattern_02.Adapter_Pattern_01.Notification;

public class EmailService {
    public void sendEmail(String message){
        System.out.println("Email notification: "+message);
    }
}
