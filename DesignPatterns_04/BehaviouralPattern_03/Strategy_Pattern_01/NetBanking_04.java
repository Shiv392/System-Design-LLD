package DesignPatterns_04.BehaviouralPattern_03.Strategy_Pattern_01;

public class NetBanking_04 implements PaymentStrategy_01{
    @Override
    public void pay(double amount){
        System.out.println("Netbanking payment done...."+amount);
    }
}
