package SOLID_Principle.LiskovSubstitutionResponsibility.BadCode;

public class Penguine extends Birds {
    @Override
    public void fly(){
        throw new UnsupportedOperationException("Penguine cannot fly");
    }
    
}
