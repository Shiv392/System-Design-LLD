package SoftwareDesignPrinciples.CompositionOverInheritance_04.GoodDesign;

public class CannotFly implements FlyInterface {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Cannot fly..........");
    }
    
}
