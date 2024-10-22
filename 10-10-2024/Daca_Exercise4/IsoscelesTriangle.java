package Daca_Exercise4;

public class IsoscelesTriangle extends Triangle {

	public IsoscelesTriangle(double sides, double base) {
		super(sides, base);
	}
	
	@Override
	public double calculateArea() {
		return ((Math.sqrt(Math.pow(getSides(), 2) - Math.pow(getBase() / 2, 2))) * getBase()) / 2;
	}
	
	@Override
	public double calculatePerimeter() {
		return getBase() + (2 * getSides());
	}

	@Override
	public String toString() {
		return "Isosceles Triangle:\n Side is " + getSides() + "\n Base is " + getBase();
	}
	
}
