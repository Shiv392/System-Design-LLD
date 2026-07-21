package DesignPatterns_04.StructuralPattern_02.Adapter_Pattern_01;

public class Main {
    public static void main(String[] args) {
        PhonePay phonePay = new PhonePay();
        Payment payment = new Payment();

       PaymentGateway phonePayPayment = new PhonePayAdapter(phonePay);
       phonePayPayment.pay(50000);
       payment.pay(4040);
    }
}
