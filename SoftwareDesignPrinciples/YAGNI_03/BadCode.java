package SoftwareDesignPrinciples.YAGNI;

public class BadCode {

    public void printName() {
        System.out.println("Shiv");
    }

    // Future me shayad email bhejna pade
    public void sendEmail() {}

    // Future me SMS bhejna pade
    public void sendSMS() {}

    // Future me WhatsApp bhejna pade
    public void sendWhatsApp() {}
}

// Ye sab methods unused hain.
// Ye YAGNI violation hai.