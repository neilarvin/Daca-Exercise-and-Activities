package Daca_L9Activity1;

public class BookRentalSystem {
	
	static Book[] availableBooks = new Book[]{
			new FictionBook("The Lord of The Rings", "J.R.R. Tolkien", 1954),
			new FictionBook("To Kill a Mockingbird", "Harper Lee", 1960),
			new NonFictionBook("The Tipping Point", "M. Gladwell", 2000),
			new NonFictionBook("Guns, Germs and Steel", "Jared Diamond", 1997)
	};

	public static void main(String[] args) {
		displayBooks();
		availableBooks[0].rent();
		availableBooks[2].rent();
		rentedBooks();
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

}
