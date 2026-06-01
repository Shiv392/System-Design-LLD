package BestPractice;

public class Employee {
    private String name;
    private double salary;

    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName(){ return this.name;}

    public double getSalary() { return this.salary;}
}
