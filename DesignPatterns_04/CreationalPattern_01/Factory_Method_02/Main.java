package DesignPatterns_04.CreationalPattern_01.Factory_Method_02;

public class Main {
    public static void main(String[]args){
        PaymentInterface upiPayment = PaymentFactory.getPayment("UPI");
        PaymentInterface cardPayment = PaymentFactory.getPayment("CARD");
        PaymentService paymentService = new PaymentService();

        paymentService.makePayment(upiPayment);
        paymentService.makePayment(cardPayment);        
    }
}
