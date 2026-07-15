package SoftwareDesignPrinciples.CompositionOverInheritance_04.BadCode;

public class Panguine extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins can't fly");
    }
}
