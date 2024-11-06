package Daca_L15Activity1;

public class GenericsCalculator <T extends Number> {

	private T num1;
	private T num2;
	
	GenericsCalculator(T num1, T num2){
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public T Addition() {
		System.out.println(num1.doubleValue() +  " + " + num2.doubleValue() +  " = " + (num1.doubleValue() + num2.doubleValue()) + "\n");
		return null;
	}
	
	public T Subtraction() {
		System.out.println(num1.doubleValue() +  " - " + num2.doubleValue() +  " = " + (num1.doubleValue() - num2.doubleValue()) + "\n");
		return null;
	}
	
	public T Multiplication() {
		System.out.println(num1.doubleValue() +  " * " + num2.doubleValue() +  " = " + (num1.doubleValue() * num2.doubleValue()) + "\n");
		return null;
	}
	
	public T Division() {
		System.out.println(num1.doubleValue() +  " / " + num2.doubleValue() +  " = " + (num1.doubleValue() / num2.doubleValue()) + "\n");
		return null;
	}

}
