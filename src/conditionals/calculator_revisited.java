package conditionals;

public class calculator_revisited {
	public static void main(String[] args) {

		double div1 = divide(345, 12);

		System.out.println("SUM4: " + div1);

	}

	public static double divide(double a, double b) {
		if (a < b) {
			System.out.println("parameter1 is smaller");
			return a / b;
		} else {
			System.out.println("The division cannot be performed");
			return 0;
		}
	}

}
