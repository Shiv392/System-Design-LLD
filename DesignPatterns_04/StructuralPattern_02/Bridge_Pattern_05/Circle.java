package DesignPatterns_04.StructuralPattern_02.Bridge_Pattern_05;

public class Circle extends Shape{
    public Circle(Color color){
        super(color);
    }

    @Override
    public void draw(){
        System.out.println("Shape Circle");
        color.applyColor();
    }
}
