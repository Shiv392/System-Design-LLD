package DesignPatterns_04.BehaviouralPattern_03.ChainOfResponsibility_03;

public class TeamLead_02 extends LeaveHandler_01 {
    @Override
    public void approve(int days){
        if(days<=2){
            System.out.println("Leave approved by Team Lead......");
        }
        else if(next!=null){
            next.approve(days);
        }
    }
}
