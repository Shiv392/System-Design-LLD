package SoftwareDesignPrinciples.CompositionOverInheritance_04.GoodDesign;

public class CanFly implements FlyInterface {
    @Override
    public void fly() {
        System.out.println("Flying..........");
    }
}
