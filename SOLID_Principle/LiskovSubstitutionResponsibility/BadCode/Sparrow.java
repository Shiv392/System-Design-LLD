package SOLID_Principle.LiskovSubstitutionResponsibility.BadCode;

public class Sparrow extends Birds {
    @Override
    public void fly(){
        System.out.println("Sparrow is flying");
    }
}
