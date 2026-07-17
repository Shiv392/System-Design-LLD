package DesignPatterns_04.CreationalPattern_01.Factory_Method_02.RealFactoryMethod;

import DesignPatterns_04.CreationalPattern_01.Factory_Method_02.CardPayment;
import DesignPatterns_04.CreationalPattern_01.Factory_Method_02.PaymentInterface;

public class CardFactory implements PaymentFactoryInterface {
    @Override
    public PaymentInterface createPayment(){
        return new CardPayment();
    }
}
