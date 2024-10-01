package Daca_L7Activity;

import java.util.Arrays;

public class Daca_L7Activity1 {

	public static void main(String[] args) {
		
		Passenger passenger = new Passenger("Neil Arvin Daca", 'M', "Filipino", "November 23, 1999");

		System.out.println(passenger.name);
		System.out.println(passenger.gender);
		System.out.println(passenger.nationality);
		System.out.println(passenger.dateOfBirth);
		System.out.println(Arrays.toString(passenger.passport));
		
	}

}
