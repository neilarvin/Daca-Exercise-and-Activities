package Daca_Exercise4;

public class Main {

	public static void main(String[] args) {
		
		Triangle commonTri = new Triangle(6, 4);
		IsoscelesTriangle isoscelesTri = new IsoscelesTriangle(50, 30);
		RightTriangle rightTri = new RightTriangle(3, 4, 5);

		System.out.println("Triangle\n Area: " + commonTri.calculateArea() + "\n Perimeter: " + commonTri.calculatePerimeter());
		
		System.out.println("\nIsosceles Triangle\n Area: " + isoscelesTri.calculateArea() + "\n Perimeter: " + isoscelesTri.calculatePerimeter());
		
		System.out.println("\nRight Triangle\n Area: " + rightTri.calculateArea() + "\n Perimeter: " + rightTri.calculatePerimeter());
	}

}
