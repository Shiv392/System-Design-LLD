package SoftwareDesignPrinciples.CompositionOverInheritance_04.GoodDesign;

public class Main {
    public static void main(String[] args) {
        Bird sparrow = new Bird(new CanFly());
        sparrow.fly();

        Bird penguin = new Bird(new CannotFly());
        penguin.fly();
    }
}
