package SOLID_Principle.InterfaceSegregationResponsibility.BestPractice;

public class Main {
    public static void main(String[] args) {
        WorkableInterface human = new Human();
        human.work();

        EatableInterface humanEatable = new Human();
        humanEatable.eat();

        SleepInterface humanSleepable = new Human();
        humanSleepable.sleep();

        WorkableInterface robot = new Robot();
        robot.work();
    }
}
