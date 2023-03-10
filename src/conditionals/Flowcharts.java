package conditionals;

public class Flowcharts {
	public static void main(String[] args) {
		int a = 7;
		int b = 10;
		boolean boo = false;

		if (boo) {
			System.out.println("Sum of the 2 numbers: " + sum(a, b));
		} else {
			System.out.println("Multplication of the 2 numbers: " + multiply(a, b));
		}
	}

	public static int sum(int a, int b) {
		return a + b;
	}

	public static int multiply(int a, int b) {
		return a * b;
	}

}
