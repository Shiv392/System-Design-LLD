package DesignPatterns_04.BehaviouralPattern_03.ChainOfResponsibility_03;

public class Director extends LeaveHandler_01{
    @Override
    public void approve(int days){
        System.out.println("Leave approved by Director");
    }
}
