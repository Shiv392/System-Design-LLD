package DesignPatterns_04.CreationalPattern_01.Factory_Method_02;

public class CardPayment implements PaymentInterface {
    @Override
    public void pay(){
        System.out.println("Card payment done..........");
    }
}
