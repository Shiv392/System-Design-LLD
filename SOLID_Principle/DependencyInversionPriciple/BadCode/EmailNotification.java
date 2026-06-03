package SOLID_Principle.DependencyInversionPriciple.BadCode;

public class EmailNotification {
    public void send(String message) {
        System.out.println("Sending email notification: " + message);
    }
}
