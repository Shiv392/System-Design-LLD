package SOLID_Principle.DependencyInversionPriciple.BestPractice;

public class Main {
    public static void main(String[] args){
        NotificationInterface emailNotification = new EmailNotification();
        NotificationInterface slackNotification = new SlackNotification();

        NotificationManager notificationManage = new NotificationManager();
        notificationManage.send(emailNotification, "Hello, this is an email notification!");
        notificationManage.send(slackNotification, "Hello, this is a slack notification!");
    }
}
