package Daca_L15Activity1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static boolean errorCaught = true, using = true;
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double num1 = 0, num2 = 0;
		
		while(using) {
			
			while(errorCaught) {
				try {
					System.out.print("1st number: ");
					num1 = scan.nextDouble();
					errorCaught = false;
				}catch(InputMismatchException e) {
					System.err.println("Error: Input should only be numbers.!!");
					errorCaught = true;
					scan.next();
				}
			}
			
			errorCaught = true;
			
			while(errorCaught) {
				try {
					System.out.print("2nd number: ");
					num2 = scan.nextDouble();
					errorCaught = false;
				}catch(InputMismatchException e) {
					System.err.println("Error: Input should only be numbers.!!");
					errorCaught = true;
					scan.next();
				}
			}

			errorCaught = true;

			calculate(new GenericsCalculator<Double>(num1, num2), scan);
			
		}
		
		scan.close();
		
	}
	
	static void calculate(GenericsCalculator<Double> calculate, Scanner scan) {
		
		System.out.print("[A] Addition\n[B] Subtraction\n[C] Multiplication\n[D] Division\n[E] Exit Program\nOperation: ");
		char operation = scan.next().toUpperCase().charAt(0);
		
		switch(operation) {
		case 'A':
			calculate.Addition();
			break;
		case 'B':
			calculate.Subtraction();
			break;
		case 'C':
			calculate.Multiplication();
			break;
		case 'D':
			calculate.Division();
			break;
		case 'E':
			System.out.println("\nThank you for using this calculator!!");
			using = false;
			break;
		default:
			System.err.println("\nInvalid operation!");
			
	}
		
	}

}
