package DesignPatterns_04.CreationalPattern_01.Prototype_Pattern_04;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setName("Shiv Soni");

        Employee emp2 = emp1.clone();
        emp2.setName("Rahul");

        System.out.println("emp1 name: "+emp1.getName());
        System.out.println("emp2 name : "+ emp2.getName());
    }
}
