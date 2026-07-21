package DesignPatterns_04.StructuralPattern_02.Decorator_Pattern_02.Pizza_01;

public class MushroomDecorator_05 extends PizzaDecorator_03 {
    MushroomDecorator_05(PizzaInterface_01 pizza){
        super(pizza);
    }

    @Override
    public String getDescription(){

        return pizza.getDescription()
                +" + Mushroom";

    }

    @Override
    public int getCost(){

        return pizza.getCost()+60;

    }
}