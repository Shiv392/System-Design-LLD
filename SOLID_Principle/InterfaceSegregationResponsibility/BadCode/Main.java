package SOLID_Principle.InterfaceSegregationResponsibility.BadCode;

public class Main {
    public static void main(String[] args){
        Human human = new Human();
        human.work();
        human.eat();
        human.sleep();

        Robot robot  = new Robot();
        robot.work();
        robot.eat();
        robot.sleep();
    }
}
