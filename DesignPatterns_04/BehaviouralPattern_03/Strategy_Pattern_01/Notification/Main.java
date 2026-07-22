package DesignPatterns_04.BehaviouralPattern_03.Strategy_Pattern_01.Notification;

public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService(new EmailNotification());
        notificationService.notify("ShivSoni");

        notificationService = new NotificationService(new SlackNotification());
        notificationService.notify("ShivSoni");

        notificationService = new NotificationService(new WhatsappNotification());
        notificationService.notify("ShivSoni");

        notificationService = new NotificationService(new TelegramNotification());
        notificationService.notify("ShivSoni");
    }
}
