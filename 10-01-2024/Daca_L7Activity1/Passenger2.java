package Daca_L7Activity;

public class Passenger2 {
	
	public String name;
	public char gender;
	public String nationality;
	public String dateOfBirth;
	public long pwdNumber;
	
	public Passenger2(String name, char gender, String nationality, String dateOfBirth) {

		this.name = name;
		this.gender = gender;
		this.nationality = nationality;
		this.dateOfBirth = dateOfBirth;
		
	}
	
	public Passenger2(String name, char gender, String nationality, String dateOfBirth, long pwdNumber) {

		this(name, gender, nationality, dateOfBirth);
		this.pwdNumber = pwdNumber;
		
	}
	
	public String toString() {
		
			return (pwdNumber == 0 ? "" : "\n") + 
					"Name: " + name +
					"\nGender: " + gender +
					"\nNationality: " + nationality +
					"\nDate of Birth: " + dateOfBirth +
					(pwdNumber == 0 ? "" : "\nPWD ID No: " + pwdNumber);
		
		
	}

}
