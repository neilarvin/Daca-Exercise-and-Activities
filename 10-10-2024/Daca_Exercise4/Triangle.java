package Daca_Exercise4;

public class Triangle {

	private double sides;
	private double base;
	
	public Triangle(double sides, double base) {
		this.sides = sides;
		this.base = base;
	}
	
	public double getSides() {
		return sides;
	}
	
	public double getBase() {
		return base;
	}
	
	public double calculateArea() {
		return (sides * base) / 2;
	}
	
	public double calculatePerimeter() {
		return sides * 2 + base;
	}

}
