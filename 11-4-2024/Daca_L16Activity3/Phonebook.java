package Daca_L16Activity3;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Phonebook {
	
	public static HashMap<String, Long> phoneBook = new HashMap<String, Long>();
	public static OutOfBoundDigitsException validator = new OutOfBoundDigitsException("");
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String...args) {
		
		startOperations();
		scan.close();
		
	}
	
	public static void addPhoneBook() {
		
		String nameInput;
		Long phoneInput;
		boolean errorCaught = true;
		
		System.out.print("Input name #" + (phoneBook.size() + 1) + " here: ");
		nameInput = scan.next();
		
		while(errorCaught) {
			System.out.print("Input number of name #" + (phoneBook.size() + 1) + " here: ");
			try {
				phoneInput = scan.nextLong();
	            validator.validateDigits(phoneInput);
	            phoneBook.put(nameInput, phoneInput);
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
			
	}
	
	public static void startOperations() {
		
		while(true) {
			System.out.println("Neil's Phonebook\n\n1. Add contacts\n2. Display contacts\n3. Search contact\n4. Close");
			System.out.print("Enter your choice: ");
			int choice = scan.nextInt();
			System.out.println();
			scan.nextLine();
			
			switch(choice){
			case 1:
				addPhoneBook();
				break;
			case 2:
				displayPhoneBook();
				break;
			case 3:
				String search; System.out.print("Search a name: ");search = scan.next();	
				searchName(search);
				break;
			case 4:
				System.out.println("Goodbye!");
				break;
			case 5:
			default: System.out.println("Invalid choice. Please try again.");
			}
		}
		
	}
	
	public static void displayPhoneBook() {
		
		System.out.println("Phonebook:");
		for(String key : phoneBook.keySet()) {
			System.out.println(" + " + key);
		}
		System.out.println();
		
	}

	public static void searchName(String search) {
		
		if(phoneBook.containsKey(search)) {
			
			System.out.println("\nName: " + search);
			System.out.println("Phone Number: " + phoneBook.get(search));
			
		}else {
			
			System.out.println("\nNot found in phoneBook");
			
		}
		
		System.out.println();
			
		
	}

}
