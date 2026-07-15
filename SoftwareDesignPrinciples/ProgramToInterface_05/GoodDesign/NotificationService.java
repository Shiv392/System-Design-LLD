package SoftwareDesignPrinciples.ProgramToInterface_05.GoodDesign;

public class NotificationService {
    public void sendNotification(NotificationInterface notification, String message){
        notification.sendNotification(message);
    }
}
