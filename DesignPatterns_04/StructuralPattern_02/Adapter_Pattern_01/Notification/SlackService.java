package DesignPatterns_04.StructuralPattern_02.Adapter_Pattern_01.Notification;

public class SlackService {
    public void sendSlackMsg(String message){
        System.out.println("Message from slack: "+message);
    }
}
