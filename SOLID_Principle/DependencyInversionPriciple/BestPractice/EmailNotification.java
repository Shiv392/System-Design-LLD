package SOLID_Principle.DependencyInversionPriciple.BestPractice;

public class EmailNotification implements NotificationInterface {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending email notification: " + message);
    }
    
}
