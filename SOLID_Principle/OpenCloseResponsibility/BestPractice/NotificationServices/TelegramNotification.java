package SOLID_Principle.OpenCloseResponsibility.BestPractice.NotificationServices;
import SOLID_Principle.OpenCloseResponsibility.BestPractice.NotificationInterface;

public class TelegramNotification implements NotificationInterface {
    @Override
    public void sendNotification(String message){
        System.out.println("Sending Telegram Notification: "+message);
    }
    
}
