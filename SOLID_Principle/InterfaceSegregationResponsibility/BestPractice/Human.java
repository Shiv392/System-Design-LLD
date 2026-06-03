package SOLID_Principle.InterfaceSegregationResponsibility.BestPractice;

public class Human implements WorkableInterface, EatableInterface, SleepInterface {

    @Override
    public void work() {
        System.out.println("Human is working");
    }

    @Override
    public void eat() {
        System.out.println("Human is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Human is sleeping");
    }
}
