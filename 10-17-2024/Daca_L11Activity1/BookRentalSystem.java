package Daca_L11Activity1;

import java.io.*;
import java.util.Arrays;

public class BookRentalSystem {
	
	static Book[] availableBooks = new Book[]{
			new FictionBook("The Lord of The Rings", "J.R.R. Tolkien", 1954),
			new FictionBook("To Kill a Mockingbird", "Harper Lee", 1960),
			new NonFictionBook("The Tipping Point", "M. Gladwell", 2000),
			new NonFictionBook("Guns, Germs and Steel", "Jared Diamond", 1997)
	};
	
	static File file = new File("C:\\Users\\neil.daca\\eclipse-workspace\\DebugDemo\\src\\Daca_L11Activity1\\library.txt");
	
	public static void main(String[] args) throws IOException {
		
//		displayBooks();
		availableBooks[0].rent();
		availableBooks[2].rent();
//		rentedBooks();
		
		writeToFile(availableBooks);
		readFromFile();
		
	}
	
	static void rentedBooks() {
		System.out.println("\n* * * * * * * BOOKS RENTED, NEVER READ * * * * * * *");
		for(Book book: availableBooks) {
			if(book.isRented()) {
				System.out.println(book);
			}
		}
	}
	
	static void displayBooks() {
		System.out.println("* * * * * * * * * * L I B R A R Y * * * * * * * * * *");
		for(Book book: availableBooks) {
			System.out.println(book);
		}
		
	}
	
	static void writeToFile(Book[] books) throws IOException {
	
		FileWriter filewriter = new FileWriter(file);
		for(Book book: availableBooks) {
			
			if(book.isRented()) {
				filewriter.write(book + " Rented \n");
			}else {
				filewriter.write(book + "\n");
			}
			
		}
		filewriter.flush();
			
	}
	
	static void readFromFile() throws IOException {
		
		FileReader filereader = new FileReader(file);
		BufferedReader read = new BufferedReader(filereader);
		
		System.out.println("* * * * * * * * * * L I B R A R Y * * * * * * * * * *");
		String line = read.readLine();
		while(line != null) {
			System.out.println(line);
			line = read.readLine();
		}
		
	}

}
