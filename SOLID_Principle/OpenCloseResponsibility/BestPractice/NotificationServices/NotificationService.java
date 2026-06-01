package SOLID_Principle.OpenCloseResponsibility.BestPractice.NotificationServices;

import SOLID_Principle.OpenCloseResponsibility.BestPractice.NotificationInterface;

public class NotificationService {
    public void sendNotification(NotificationInterface notification, String message){
        notification.sendNotification(message);
    }
}
