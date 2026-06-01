package SOLID_Principle.OpenCloseResponsibility.BadCode;

public class Main {
    public static void main(String[] args) {
        Notifications notifications = new Notifications();
        notifications.sendNotification("Hello world!", "sms");
        notifications.sendNotification("Hello world!", "email");
        notifications.sendNotification("Hello world!", "push");
    }
}
