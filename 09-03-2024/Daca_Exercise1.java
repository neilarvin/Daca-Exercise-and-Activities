package Daca_Exercise;
import java.util.Scanner;

public class Daca_Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Application
		Scanner scan = new Scanner(System.in);
		int x, y, z, result;
		
		System.out.print("Enter first Integer: ");
		x = scan.nextInt();
		System.out.print("Enter second Integer: ");
		y = scan.nextInt();
		System.out.print("Enter third Integer: ");
		z = scan.nextInt();
		scan.close();
		
		result = x * y * z;
		
		System.out.println("Product is " + result);
	
		int array[][] = {{1,2},{3,2}};
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
		
	}

}
