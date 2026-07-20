package DesignPatterns_04.CreationalPattern_01.Prototype_Pattern_04;

public class Employee implements PrototypeInterface {
    private String name;
    private int age;

    @Override
    public Employee clone(){
        Employee emp = new Employee();
        emp.name = this.name;
        emp.age = this.age;
        return emp;
    }

    public void setName(String name){ this.name = name; }

    public String getName(){ return this.name; }
}
