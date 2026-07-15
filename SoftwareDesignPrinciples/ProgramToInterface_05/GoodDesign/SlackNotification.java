package SoftwareDesignPrinciples.ProgramToInterface_05.GoodDesign;

public class SlackNotification implements NotificationInterface {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Slack notification with message: " + message);
    }
    
}
