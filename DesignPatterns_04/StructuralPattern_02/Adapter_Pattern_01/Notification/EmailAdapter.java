package DesignPatterns_04.StructuralPattern_02.Adapter_Pattern_01.Notification;

public class EmailAdapter implements NotificationInterface {

    EmailService emailService;
    EmailAdapter(EmailService emailService){
        this.emailService = emailService;
    }

    @Override
    public void notify(String message){
        this.emailService.sendEmail(message);
    }
}
