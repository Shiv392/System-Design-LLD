package DesignPatterns_04.CreationalPattern_01.Factory_Method_02;

public class PaymentFactory {
    public static PaymentInterface getPayment(String type){
        if("UPI".equals(type)){
            return new UPIPayment();
        }
        if("CARD".equals(type)){
            return new CardPayment();
        }
        return null;
    }
}
