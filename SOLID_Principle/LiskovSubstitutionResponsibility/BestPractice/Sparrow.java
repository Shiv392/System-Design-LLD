package SOLID_Principle.LiskovSubstitutionResponsibility.BestPractice;

public class Sparrow extends FlyingBird {
    
    @Override
    public void fly(){
        System.out.println("Sparrow is flying");
    }
}
