package DesignPatterns_04.BehaviouralPattern_03.Strategy_Pattern_01;

public class PaymentService_06 {

    PaymentStrategy_01 payment;

    PaymentService_06(PaymentStrategy_01 _payment){
        payment = _payment;
    }
    
    public void makePayment(double amount){
        payment.pay(amount);
    }
}
