package BestPractice;

public class GenerateReport {
    public String generateReport(Employee employee, SalaryCalculation salaryCalculation){
        return "Employee name : "+ employee.getName()+ " and Salary : "+employee.getSalary() + " and his Annual salar is: "+salaryCalculation.calculateAnnualSalary(employee);
    }
}
