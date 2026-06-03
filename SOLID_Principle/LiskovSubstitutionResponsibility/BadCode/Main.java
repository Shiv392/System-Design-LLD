package SOLID_Principle.LiskovSubstitutionResponsibility.BadCode;

public class Main {

    public static void main(String[] args){
        Birds sparrow = new Sparrow();
        sparrow.fly();

        Birds penguine = new Penguine();
        penguine.fly();
    }
    
}
