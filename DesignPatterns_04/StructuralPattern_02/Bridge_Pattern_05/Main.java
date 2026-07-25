package DesignPatterns_04.StructuralPattern_02.Bridge_Pattern_05;

public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Circle(new Red());
        Shape shape2 = new Square(new Blue());
        Shape shape3 = new Circle(new Blue());
        Shape shape4 = new Square(new Blue());

        shape1.draw();
        shape2.draw();
        shape3.draw();
        shape4.draw();
    }
}
