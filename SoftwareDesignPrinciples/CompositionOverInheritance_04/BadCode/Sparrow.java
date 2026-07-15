package SoftwareDesignPrinciples.CompositionOverInheritance_04.BadCode;

public class Sparrow extends Bird {
    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }
}
