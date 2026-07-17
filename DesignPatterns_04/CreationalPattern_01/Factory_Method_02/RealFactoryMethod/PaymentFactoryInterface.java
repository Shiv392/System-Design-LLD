package DesignPatterns_04.CreationalPattern_01.Factory_Method_02.RealFactoryMethod;

import DesignPatterns_04.CreationalPattern_01.Factory_Method_02.PaymentInterface;

public interface PaymentFactoryInterface {
    PaymentInterface createPayment();
}
