package DesignPatterns_04.BehaviouralPattern_03.ChainOfResponsibility_03;

public class Main {
    public static void main(String[] args) {
        TeamLead_02 teamLead = new TeamLead_02();
        Manager_03 manager = new Manager_03();
        Director director = new Director();

        teamLead.setNext(manager);
        manager.setNext(director);

        teamLead.approve(2);
        teamLead.approve(5);
        teamLead.approve(11);
    }
}
