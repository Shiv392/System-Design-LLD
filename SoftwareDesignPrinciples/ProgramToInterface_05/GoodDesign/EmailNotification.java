package SoftwareDesignPrinciples.ProgramToInterface_05.GoodDesign;

public class EmailNotification implements NotificationInterface {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending email notification with message: " + message);
    }
}
