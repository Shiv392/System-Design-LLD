package SOLID_Principle.DependencyInversionPriciple.BadCode;

public class Main {
    public static void main(String[] args){
        NotificationManager notificationManager = new NotificationManager();
        notificationManager.sendNotification("Hello, this is a notification!");
    }
}
