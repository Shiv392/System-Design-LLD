package DesignPatterns_04.BehaviouralPattern_03.ChainOfResponsibility_03;

public abstract class LeaveHandler_01 {
    protected LeaveHandler_01 next;

    public void setNext(LeaveHandler_01 _next){
        next = _next;
    }

    public abstract void approve(int days);
}
