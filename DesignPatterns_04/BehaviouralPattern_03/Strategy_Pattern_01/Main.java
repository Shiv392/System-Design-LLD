package DesignPatterns_04.BehaviouralPattern_03.Strategy_Pattern_01;

public class Main {
    public static void main(String[] args) {
        PaymentService_06 payment = new PaymentService_06(new UPIPayment_02());
        payment.makePayment(2000.00);

        payment = new PaymentService_06(new CardPayment_03());
        payment.makePayment(4400.00);

        payment = new PaymentService_06(new NetBanking_04());
        payment.makePayment(55555.00);

        payment = new PaymentService_06(new PaypalPayment_05());
        payment.makePayment(999999.90);
    }
}
