package Daca_L14Activity1;

public class OutOfBoundDigitsException extends Exception {

	private static final long serialVersionUID = 1L;
	
	 public OutOfBoundDigitsException(String message) {
	        super(message); // Call the parent constructor with the error message
	 }

	public void validateDigits(long number)  throws OutOfBoundDigitsException  {
		
		String str;
		int str_length;
		boolean isValid;
		
		str = Long.toString(number);
		str_length = str.length();	
		isValid = str_length == 10;
		
		if(!isValid) {
			throw new OutOfBoundDigitsException("\nInvalid phone number! Only 10-digit numbers are allowed.");
		}
		
	}
	
}
