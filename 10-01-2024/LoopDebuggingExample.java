package DebuggingExercises;

public class LoopDebuggingExample {

	public static void main(String[] args) {
		int n = 10;
		int sum = calculateSum(n);
		System.out.println("Sum: " + sum);
		
		int factorial = calculateFactorial(n);
		System.out.println("Factorial: " + factorial);
		
		int fibonacci = calculateFibonacci(n);
		System.out.println(" Fibonacci: " + fibonacci);
	}
	
	public static int calculateSum(int n) {
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static int calculateFactorial(int n) {
		int factorial = 1;
		for(int i = 1; i <= n; i++) {
			factorial *= i;
		}
		return factorial;
	}
	
	public static int calculateFibonacci(int n) {
		int a = 0, b = 1, c = 0;
		System.out.println("Fibonacci Series: " + a + " " + b);
		
		for(int i = 2; i <= n; i++) {
			c = a + b;
			System.out.print(" " + c);
			a = b;
			b = c;
		}
		return b;
	}

}
