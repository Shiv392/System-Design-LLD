package SOLID_Principle.InterfaceSegregationResponsibility.BadCode;

//here due to single interface 
// robot class have to forcefully implement eat & sleep method which is not even required 
//this breaks Interface Segregation Principle
public class Robot implements WorkerInterface {
    @Override
    public void work(){
        System.out.println("Robot is working");
    }

    @Override
    public void eat(){
        throw new UnsupportedOperationException("Robot cannot eat");
    }

    @Override
    public void sleep(){
        throw new UnsupportedOperationException("Robot cannot sleep");
    }
}
