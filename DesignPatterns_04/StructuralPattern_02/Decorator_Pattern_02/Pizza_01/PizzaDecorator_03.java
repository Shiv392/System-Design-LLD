package DesignPatterns_04.StructuralPattern_02.Decorator_Pattern_02.Pizza_01;

abstract class PizzaDecorator_03 implements PizzaInterface_01 {
    protected PizzaInterface_01 pizza;

    PizzaDecorator_03(PizzaInterface_01 pizza){
        this.pizza = pizza;
    }
}
