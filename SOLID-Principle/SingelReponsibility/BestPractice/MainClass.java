package BestPractice;

public class MainClass {
    public static void main(String[] args){
        
        Employee employee = new Employee("Shiv Soni", 90000.00);

        SalaryCalculation salaryCalculation = new SalaryCalculation();
        GenerateReport generateReport = new GenerateReport();

        System.out.println(generateReport.generateReport(employee, salaryCalculation));

    }
}
