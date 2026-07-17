package DesignPatterns_04.CreationalPattern_01.Factory_Method_02.RealFactoryMethod;

import DesignPatterns_04.CreationalPattern_01.Factory_Method_02.PaymentInterface;

public class Main {
    public static void main(String[] args) {
        PaymentFactoryInterface upiFactory = new UPIFactory();
        PaymentFactoryInterface cardFactory = new CardFactory();

        PaymentInterface upiPayment = upiFactory.createPayment();
        PaymentInterface cardPayment = cardFactory.createPayment();

        upiPayment.pay();
        cardPayment.pay();
    }
}
