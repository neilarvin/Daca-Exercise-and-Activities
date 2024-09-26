package September26;

import java.util.Arrays;

public class Daca_L6Activity2 {

	public static void main(String[] args) {
		
		int employeeHours[] = {7, 8, 10, 6, 9, 7},
			target = 8;
		
		System.out.println("List of Employees: " + Arrays.toString(employeeHours));
		System.out.println("Target hours: " + target);
		System.out.println("Total employees who meet the target: " + employeeNum(target, employeeHours));
		

	}
	
	public static int employeeNum(int target, int[] hours) {
		
		int count = 0;
		
		for(int i = 0; i < hours.length; i++) {
			if(hours[i] >= target) {
				count++;
			}
		}
		
		return count;
		
	}

}
