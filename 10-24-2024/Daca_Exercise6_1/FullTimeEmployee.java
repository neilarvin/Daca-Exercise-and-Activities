package Daca_Exercise6_1;

public class FullTimeEmployee extends Employee{
   private double monthlySalary;
   FullTimeEmployee(String name, int employeeId, double monthlySalary){
     super(name, employeeId, 0);
     this.monthlySalary = monthlySalary;
   }
   
   @Override
   double calculatePay(){
     return this.monthlySalary;
   }
   
}
