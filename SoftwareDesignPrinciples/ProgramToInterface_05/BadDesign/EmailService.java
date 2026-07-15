package SoftwareDesignPrinciples.ProgramToInterface_05.BadDesign;

public class EmailService {
    public void sendEmail(String message) {
        System.out.println("Sending email with message: " + message);
    }
}
