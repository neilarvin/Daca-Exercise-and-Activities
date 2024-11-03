package Daca_L4Activity1;

import java.util.Scanner;

public class Daca_L4Activity1 {
	
	static final int ARRAY_LENGTH = 5;

	public static void main(String[] args) {
		
		String nameInput, search, name[] = new String[ARRAY_LENGTH];
		Long phoneNumber[] = new Long[ARRAY_LENGTH];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < ARRAY_LENGTH; i++) {
			
			System.out.print("Input name #" + (i + 1) + " here: ");
			nameInput = scan.next();
			
			if(!nameInput.equalsIgnoreCase("n/a")) {
				
				name[i] = nameInput;
				System.out.print("Input number of name #" + (i + 1) + " here: ");
				phoneNumber[i] = scan.nextLong();
				
			}else {
				
				break;
				
			}
			
		}
		
		int counter = 0;
		
		for(String person : name) {
			
			if(person != null) {
				System.out.println("[" + ++counter + "] " + person);
			}
			
		}
		
		System.out.print("\nSearch a name: ");
		search = scan.next();
		
		for(int i = 0; i < counter; i++) {
			
			if(search.equals(name[i])) {
				System.out.println("\nName: " + name[i]);
				System.out.println("Phone Number: " + phoneNumber[i]);
				break;
			}
			
		}

	}

}
