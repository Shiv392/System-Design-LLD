package SoftwareDesignPrinciples.ProgramToInterface_05.BadDesign;

public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        notificationService.sendNotification("Hello, this is a notification!");
    }
}
