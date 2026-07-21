package DesignPatterns_04.StructuralPattern_02.Adapter_Pattern_01.Notification;

public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        notificationService.notify("Hello!");

        EmailService emailService = new EmailService();
        SlackService slackService = new SlackService();

        NotificationInterface emailAdapter = new EmailAdapter(emailService);
        NotificationInterface slackAdapter = new SlackAdapter(slackService);

        emailAdapter.notify("Hello from email");
        slackAdapter.notify("Hello from slack");
    }
}
