package SOLID_Principle.OpenCloseResponsibility.BestPractice;

import SOLID_Principle.OpenCloseResponsibility.BestPractice.NotificationServices.EmailNotifiation;
import SOLID_Principle.OpenCloseResponsibility.BestPractice.NotificationServices.NotificationService;
import SOLID_Principle.OpenCloseResponsibility.BestPractice.NotificationServices.SlackNotification;
import SOLID_Principle.OpenCloseResponsibility.BestPractice.NotificationServices.PushNotification;

public class Main {
    public static void main(String[] args){
        NotificationService notificationService = new NotificationService();
        notificationService.sendNotification(new EmailNotifiation(), "Hello World!");
        notificationService.sendNotification(new SlackNotification(), "Hello world!");
        notificationService.sendNotification(new PushNotification(), "Hello world!");

    }
}
