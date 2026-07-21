package DesignPatterns_04.StructuralPattern_02.Adapter_Pattern_01;

public class Payment implements PaymentGateway {
    @Override
    public void pay(int amount){
        System.out.println("Payment recieved: "+amount);
    }
}
