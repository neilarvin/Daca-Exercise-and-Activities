package Daca_L14Activity1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Daca_L14Activity1 {
	
	static final int ARRAY_LENGTH = 5;

	public static void main(String[] args) {
		
		OutOfBoundDigitsException validator = new OutOfBoundDigitsException("");
		
		String nameInput, search, name[] = new String[ARRAY_LENGTH];
		Long phoneInput, phoneNumber[] = new Long[ARRAY_LENGTH];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < ARRAY_LENGTH; i++) {
			
			boolean errorCaught = true;
			
			System.out.print("Input name #" + (i + 1) + " here: ");
			nameInput = scan.next();
			
			if(!nameInput.equalsIgnoreCase("n/a")) {
				
				name[i] = nameInput;
				
				while(errorCaught) {
					System.out.print("Input number of name #" + (i + 1) + " here: ");
					try {
						phoneInput = scan.nextLong();
			            validator.validateDigits(phoneInput);
						phoneNumber[i] = phoneInput;
						errorCaught = false;
			        } catch (InputMismatchException e) {
			        	System.err.println("\nInvalid input! Only whole numbers are allowed.");
						errorCaught = true;
						scan.next();
			        } catch (OutOfBoundDigitsException e) {
			            System.err.println(e.getMessage());
			            errorCaught = true;
			        } 
					
				}
				System.out.println();
				errorCaught = true;
				
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
			
			if(search.equalsIgnoreCase(name[i])) {
				System.out.println("\nName: " + name[i]);
				System.out.println("Phone Number: " + phoneNumber[i]);
				break;
			}
			
		}
		
		scan.close();

	}

}
