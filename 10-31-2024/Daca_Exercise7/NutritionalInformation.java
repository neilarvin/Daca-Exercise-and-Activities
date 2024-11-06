package Daca_Exercise7;

import java.util.Scanner;

public class NutritionalInformation {
	
	public enum Fruit{
		APPLE(new Nutrition(95, 7.9)),
		BANANA(new Nutrition(105, 9.1)),
		ORANGE(new Nutrition(63, 53.2));

		private final Nutrition nutrition;

		Fruit(Nutrition nutrition) {
			this.nutrition = nutrition;
		}
		
		public Nutrition getNutrition() {
			return nutrition;
		}
		
	}
	
	public static class Nutrition{
		
		private final int calories;
		private final double vitaminC;
		
		Nutrition(int calories, double vitaminC){
			this.calories = calories;
			this.vitaminC = vitaminC;
		}

		@Override
		public String toString() {
			return "\nCalories: " + this.calories + "\nVitamin C: " + this.vitaminC + "\n";
		}
		
	}
	
	public static void main(String...args) {
		
		Scanner scan = new Scanner(System.in);
		String fruitName;
		
		System.out.print("Enter a fruit name (Apple, Banna, Orange): ");
		fruitName = scan.next();		
		
		try {
			Fruit fruit = Fruit.valueOf(fruitName.toUpperCase());
			System.out.println("Nutritional Information for " + fruitName + fruit.getNutrition());
		}catch(IllegalArgumentException e) {
			System.out.println("Error: Invalid fruit name entered.");
		}
		
		scan.close();
		
	}

}
