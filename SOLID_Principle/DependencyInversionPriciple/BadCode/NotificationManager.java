package SOLID_Principle.DependencyInversionPriciple.BadCode;

public class NotificationManager {
    EmailNotification emailNotification = new EmailNotification();

    public void sendNotification(String message) {
        emailNotification.send(message);
    }
}
