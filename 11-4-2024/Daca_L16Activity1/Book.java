package Daca_L16Activity1;

class Book {
	
	private String title;
	private String author;
	private int yearPublished;
	private boolean isRented;
	private String dateDue;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getYearPublished() {
		return yearPublished;
	}
	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}
	
	public boolean isRented() {
		return isRented;
	}
	public void setRented(boolean isRented) {
		this.isRented = isRented;
	}
	
	public String getDueDate() {
		return dateDue;
	}
	public void setDueDate(String dateDue) {
		this.dateDue = dateDue;
	}
	
	public Book(String title, String author, int yearPublished) {
		this.title = title;
		this.author = author;
		this.yearPublished = yearPublished;
		this.isRented = false;
	}
	
	public void rent(String dateDue) {
		setDueDate(dateDue);
		setRented(true);
	}
	
	public String toString() {
		if(isRented) {
			return getTitle() + "\t" + getAuthor() + "\t" + getYearPublished() + "\tDue date: " + getDueDate();
		}else {
			return getTitle() + "\t" + getAuthor() + "\t" + getYearPublished();
		}
	}
	
}
