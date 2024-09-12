package Lessons;

import java.util.Arrays;

public class Daca_Exercise3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int ARRAY_SIZE = 10;
		double sum = 0, array[] = new double[ARRAY_SIZE];
		Arrays.fill(array, 0.0);
		
		System.out.println(array[4]);
		
		array[9] = 1.667;
		array[6] = 3.333;
		
		for(double arrVal: array) {
			sum += arrVal;
		}
		
		System.out.println(sum);
		
	}

}
