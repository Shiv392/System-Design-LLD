package DesignPatterns_04.CreationalPattern_01.Factory_Method_02;

public class PaymentService {
    public void makePayment(PaymentInterface payment){
        payment.pay();
    }
}
