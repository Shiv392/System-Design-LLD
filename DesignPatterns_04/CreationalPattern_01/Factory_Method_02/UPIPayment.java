package DesignPatterns_04.CreationalPattern_01.Factory_Method_02;

public class UPIPayment implements PaymentInterface {
    @Override   
    public void pay(){
        System.out.println("UPI Payment done.........");
    }
}
