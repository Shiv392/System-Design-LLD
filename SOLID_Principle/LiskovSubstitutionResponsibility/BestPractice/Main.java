package SOLID_Principle.LiskovSubstitutionResponsibility.BestPractice;

public class Main {
    public static void main(String[] args) {
        FlyingBird sparrow = new Sparrow();
        sparrow.fly();

        Bird penguine = new Penguine();
        ((Penguine) penguine).swim();
    }
}
