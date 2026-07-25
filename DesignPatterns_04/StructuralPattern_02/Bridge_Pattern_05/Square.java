package DesignPatterns_04.StructuralPattern_02.Bridge_Pattern_05;

public class Square extends Shape {
    public Square(Color _color){
        super(_color);
    }

    @Override
    public void draw(){
        System.out.println("Shape Square");
        color.applyColor();
    }
}
