package DesignPatterns_04.BehaviouralPattern_03.ChainOfResponsibility_03;

public class Manager_03 extends LeaveHandler_01{
    @Override
    public void approve(int days){
        if(days<=5){
            System.out.println("Leave approved by Manager........");
        }
        else if(next!=null){
            next.approve(days);
        }
    }
}
