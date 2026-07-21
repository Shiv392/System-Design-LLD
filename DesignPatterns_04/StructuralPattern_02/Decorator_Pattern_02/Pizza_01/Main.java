package DesignPatterns_04.StructuralPattern_02.Decorator_Pattern_02.Pizza_01;

public class Main {
    public static void main(String[] args) {
        PizzaInterface_01 pizza = new MushroomDecorator_05(
            new CheeseDecorator_04(
                new Margarhita_02()
            )
        );

        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());
    }
}
