package SOLID_Principle.InterfaceSegregationResponsibility.BestPractice;

public class Robot implements WorkableInterface {
    @Override
    public void work() {
        System.out.println("Robot is working");
    }
    
}
