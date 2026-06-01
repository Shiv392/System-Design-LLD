package BadCode;

//now Employee class has multiple responsibilities
//1. calculating salary, 2. saving to database, 3. generating report
//this breaks Single responsibility principle

//issue : if we need to change salary calculation method or logic 
//if we need to change database from mysql to postgresql 
//or we need to change report formate from pdf to excel.

//then we have to change in this class i.e this class is not longer single change 
//also suppose i created this same calculateAnnualSlaary method in other clasess then 
//we also have to change it in all those classes which is not good. 

//Thats' wy we should follow Single Reponsibility principle for better maintainability and scalability of our code. 
//by using single responsibility principle we can create seperate classes for each responsibility 
//then easily using those classess in out main Employee classes.
//so in future if we have to change any logic or add more methods related to the salary calculation
//then we can easily do that in their clases without affecting other part of the code. 

public class Employee {
    private String name;
    private double salary;

    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    //calculate annual salary
    public double calculateAnnualSalary(){
        return salary*12;
    }

    //save employee to database
    public void saveToDatabase(){
        System.out.println("Saving employee to database...");
    }

    //generate report
    public void generateReport(){
        System.out.println("Generating employee report...");
    }
}
