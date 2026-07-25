package DesignPatterns_04.StructuralPattern_02.Bridge_Pattern_05;

//Shapas has color i.e HAS-A relationship.s
public abstract class Shape {
    protected Color color;
    
    public Shape(Color _color){
        color = _color;
    }

    abstract void draw();
}
