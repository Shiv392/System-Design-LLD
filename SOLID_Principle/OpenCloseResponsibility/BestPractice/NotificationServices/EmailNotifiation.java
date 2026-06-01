package SOLID_Principle.OpenCloseResponsibility.BestPractice.NotificationServices;

import SOLID_Principle.OpenCloseResponsibility.BestPractice.NotificationInterface;

public class EmailNotifiation implements NotificationInterface {
    @Override
    public void sendNotification(String message){
        System.out.println("Sending Email Notification: "+message);
    }
}
