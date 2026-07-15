package SoftwareDesignPrinciples.ProgramToInterface_05.BadDesign;

public class NotificationService {
    public void sendNotification(String message) {
        EmailService emailService = new EmailService();
        emailService.sendEmail(message);
    }
}
