package SOLID_Principle.DependencyInversionPriciple.BestPractice;

public class NotificationManager {

    public void send(NotificationInterface notificationInterface, String message) {
        notificationInterface.sendNotification(message);
    }
    
}
