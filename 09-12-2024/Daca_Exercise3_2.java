package Lessons;

import java.util.*;

public class Daca_Exercise3_2 {

	static final int ARRAY_SIZE = 10;
	static int choice, occupy = 0;
	static char seat[] = new char[ARRAY_SIZE];
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		Arrays.fill(seat, '0');
		display();
		
	}
	
	public static void firstclassAdd() {
		
		for(int i = 0; i <= 5; i++) {
			
			if(i == 5) { //Full
				
				System.err.println("\nFirst Class Section is Full!\n");
				String decision;
				do {
					System.out.print("\nYou want to switch to Economy? y/n : ");
					decision = scan.next();
					decision = decision.toLowerCase();
					if(decision.equals("y")) {
						economyAdd();
					}else if(decision.equals("n")){
						break;
					}else {
						System.err.println("\nInvalid Choice");
					}
				}while(decision != "y" || decision != "n") ;
				
			}else if(seat[i] == 'X') {
				
				continue;
				
			}else {
				
				seat[i] = 'X';
				occupy++;
				break;
				
			}
			
		}
		
		display();
		
	}
	
	public static void economyAdd() {
		
		for(int i = 0; i <= 10; i++) {
			
			if(i == 10) { //Full
				
				System.err.println("\nEconomy Section is Full!\n");
				String decision;
				do {
					System.out.print("\nYou want to switch to First Class? y/n : ");
					decision = scan.next();
					decision = decision.toLowerCase();
					if(decision.equals("y")) {
						firstclassAdd();
					}else if(decision.equals("n")){
						break;
					}else {
						System.err.println("\nInvalid Choice");
					}
				}while(decision != "y" || decision != "n") ;
				
			}else if(seat[i] == 'X') {
				
				continue;
				
			}else {
				
				seat[i] = 'X';
				occupy++;
				break;
				
			}
			
		}
		
		display();
		
	}
	
	public static void display() {
		
		while(occupy < seat.length + 1){

			System.out.println("------------------------------");
			System.out.print(Arrays.toString(seat));
			System.out.println("\n------------------------------");
			
			System.out.println("\nPlease type 1 for First Class.\nPlease type 2 for Economy.");
			System.out.print("Choice: ");
			choice = scan.nextInt();
			
			if(choice == 1) {
				
				firstclassAdd();
					
			}else if(choice == 2) {
				
				economyAdd();
				
			}else {
				
				System.err.println( "\nInvalid Choice!\n");
				
			}
			
		}
	}

}
