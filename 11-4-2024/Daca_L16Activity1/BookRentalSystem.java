package Daca_L16Activity1;

import java.util.ArrayList;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class BookRentalSystem {
	
	static LocalDate currentDate = LocalDate.now().plusWeeks(3);
	static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	
	static ArrayList<Book> library = new ArrayList<>();

	public static void main(String[] args) {
		addBooks();
		displayBooks();
		library.get(0).rent(currentDate.format(formatter));
		library.get(2).rent(currentDate.format(formatter));
		rentedBooks();
	}
	
	static void addBooks() {
		library.add(new FictionBook("The Lord of The Rings", "J.R.R. Tolkien", 1954));
		library.add(new FictionBook("To Kill a Mockingbird", "Harper Lee", 1960));
		library.add(new NonFictionBook("The Tipping Point", "M. Gladwell", 2000));
		library.add(new NonFictionBook("Guns, Germs and Steel", "Jared Diamond", 1997));
	}
	
	static void rentedBooks() {
		System.out.println("\n* * * * * * * * * * * BOOKS RENTED, NEVER READ * * * * * * * * * * *");
		for(Book book: library) {
			if(book.isRented()) {
				System.out.println(book);
			}
		}
	}
	
	static void displayBooks() {
		System.out.println("* * * * * * * * * * L I B R A R Y * * * * * * * * * *");
		for(Book book: library) {
			System.out.println(book);
		}
		
	}

}
