package DesignPatterns_04.StructuralPattern_02.Adapter_Pattern_01;

public class PhonePayAdapter implements PaymentGateway {
    PhonePay phonePay;

    PhonePayAdapter(PhonePay phonePay){
        this.phonePay = phonePay;
    }

    @Override
    public void pay(int amount){
        this.phonePay.makePayment(amount);
    }
}
