package Daca_L7Activity;

public class Passenger {
	
	public String name;
	public char gender;
	public String nationality;
	public String dateOfBirth;
	public String[] passport;
	
	public Passenger(String name, char gender, String nationality, String dateOfBirth) {

		this.name = name;
		this.gender = gender;
		this.nationality = nationality;
		this.dateOfBirth = dateOfBirth;
		this.passport = new String[] {name, nationality, dateOfBirth};
		
	}
	
	
//	Passenger(){
//		
//		name = "Neil Arvin Daca";
//		gender = 'M';
//		nationality = "Filipino";
//		dateOfBirth = "November 23, 1999";
//		passport = new String[] {name, String.valueOf(gender), nationality, dateOfBirth};
//		
//	}
	
	
	
}
