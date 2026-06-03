package SOLID_Principle.InterfaceSegregationResponsibility.BadCode;

public class Human implements WorkerInterface {
    @Override
    public void work(){
        System.out.println("Human is working");
    }

    public void eat(){
        System.out.println("Human is eating");
    }

    public void sleep(){
        System.out.println("Human is sleeping");
    }
}
