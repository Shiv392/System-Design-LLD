package SoftwareDesignPrinciples.CompositionOverInheritance_04.GoodDesign;

public class Bird {
    private FlyInterface flyBehavior;

    Bird(FlyInterface flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void fly(){
        flyBehavior.fly();
    }
}
