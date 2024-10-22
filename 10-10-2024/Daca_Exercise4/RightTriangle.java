package Daca_Exercise4;

public class RightTriangle extends Triangle {
	
	private double height;

	public RightTriangle(double base, double sides, double height) {
		super(sides, base);
		this.height = height;
	}
	
	@Override
	public double calculateArea() {
		return (getBase() * height) / 2;
	}
	
	@Override
	public double calculatePerimeter() {
		return (super.calculatePerimeter() - getSides()) + height;
	}

	@Override
	public String toString() {
		return "Right Triangle:\n Side is " + getSides() + "\n Base is " + getBase() + "\n Height is " + height;
	}

}
