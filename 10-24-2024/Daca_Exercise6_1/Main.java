package Daca_Exercise6_1;

public class Main {

  public static void main(String[] args) {
  
     Employee fullTime = new FullTimeEmployee("Jun", 1, 20000);
     Employee partTime = new ParttimeEmployee("Jen", 2, 200, 200);
     Employee contractor = new Contractor("Jan", 3, 500, 160);
     
     System.out.println("Employee Name: " + fullTime.getName() + "\nEmployee Id: " + fullTime.getEmployeeId() + "\nSalary: " + fullTime.calculatePay());
     
     
     System.out.println("\nEmployee Name: " + partTime.getName() + "\nEmployee Id: " + partTime.getEmployeeId() + "\nSalary: " + partTime.calculatePay());
     
     System.out.println("\nEmployee Name: " + contractor.getName() + "\nEmployee Id: " + contractor.getEmployeeId() + "\nSalary: " + contractor.calculatePay());
     
  }
}
