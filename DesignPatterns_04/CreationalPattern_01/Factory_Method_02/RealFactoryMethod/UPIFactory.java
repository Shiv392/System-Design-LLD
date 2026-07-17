package DesignPatterns_04.CreationalPattern_01.Factory_Method_02.RealFactoryMethod;

import DesignPatterns_04.CreationalPattern_01.Factory_Method_02.PaymentInterface;
import DesignPatterns_04.CreationalPattern_01.Factory_Method_02.UPIPayment;

public class UPIFactory implements PaymentFactoryInterface {
    @Override
    public PaymentInterface createPayment(){
        return new UPIPayment();
    }
}
