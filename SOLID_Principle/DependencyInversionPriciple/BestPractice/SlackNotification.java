package SOLID_Principle.DependencyInversionPriciple.BestPractice;

public class SlackNotification implements NotificationInterface {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending slack notification: " + message);
    }
    
}
