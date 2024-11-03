package Daca_Exercise6_1;

public abstract class Employee {

   private String name;
   private int employeeId;
   private double hourlyRate;
   
   Employee(String name, int employeeId, double hourlyRate){
     this.name = name;
     this.employeeId = employeeId;
     this.hourlyRate = hourlyRate;
   }
   
   abstract double calculatePay();
   
   public String getName(){
     return this.name;
   }
   public void setName(String name){
     this.name = name;
   }
   public int getEmployeeId(){
     return this.employeeId;
   }
   public void setEmployeeId(int employeeId){
     this.employeeId = employeeId;
   }
   public double getHourlyRate(){
     return this.hourlyRate;
   }
   public void setHourlyRate(double hourlyRate){
     this.hourlyRate = hourlyRate;
   }

}


