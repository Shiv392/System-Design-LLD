package DesignPatterns_04.StructuralPattern_02.Decorator_Pattern_02.Pizza_01;

public class CheeseDecorator_04 extends PizzaDecorator_03 {
    CheeseDecorator_04(PizzaInterface_01 pizza){
        super(pizza);
    }

    @Override
    public String getDescription(){
        return pizza.getDescription()
                +" + Cheese";
    }

    @Override
    public int getCost(){

        return pizza.getCost()+50;

    }
}
