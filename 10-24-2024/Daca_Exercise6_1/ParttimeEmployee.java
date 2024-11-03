package Daca_Exercise6_1;

public class ParttimeEmployee extends Employee {
   private int hoursWorked;
   ParttimeEmployee(String name, int employeeId, double hourlyRate, int hoursWorked){
     super(name, employeeId, hourlyRate);
     this.hoursWorked = hoursWorked;
   }
   
   @Override
   double calculatePay(){
     return getHourlyRate() * this.hoursWorked;
   }
   
}
