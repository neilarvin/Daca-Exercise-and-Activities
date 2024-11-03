package Daca_Exercise6_1;

public class Contractor extends Employee{
   private int hoursWorked;
   Contractor(String name, int employeeId, double hourlyRate, int hoursWorked){
     super(name, employeeId, hourlyRate);
     this.hoursWorked = hoursWorked;
   }
   
   @Override
   double calculatePay(){
     return getHourlyRate() * this.hoursWorked;
   }
   
}
