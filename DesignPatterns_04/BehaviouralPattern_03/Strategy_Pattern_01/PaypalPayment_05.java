package DesignPatterns_04.BehaviouralPattern_03.Strategy_Pattern_01;

public class PaypalPayment_05 implements PaymentStrategy_01{
    @Override
    public void pay(double amount){
        System.out.println("Paypal payment done......"+amount);
    }
}
