package SoftwareDesignPrinciples.ProgramToInterface_05.GoodDesign;

public class Main {
    public static void main(String[]arges){
        NotificationService notificationService = new NotificationService();

        notificationService.sendNotification(new EmailNotification(), "Hello, this is an email notification!");
        notificationService.sendNotification(new SlackNotification(), "Hello, this is a Slack notification!");
    }
}
