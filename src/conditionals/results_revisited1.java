package conditionals;

public class results_revisited1 {
	public static void main(String[] args) {
		int pScore = 85;
		int cScore = 100;
		int bScore = 125;
		int resultTotal = (pScore + cScore + bScore);
		double pPercent = ((pScore * 100) / 150);
		double cPercent = ((cScore * 100) / 150);
		double bPercent = ((bScore * 100) / 150);
		double percentage = (((resultTotal) * 100) / 450);

		if (pPercent < 60 && cPercent > 60) {
			System.out.println("Physics: FAIL, Chemistry: PASS");
		}
		if (pPercent < 60 && bPercent > 60) {
			System.out.println("Physics: FAIL, Biology: PASS");
		}
		if (cPercent > 60 && bPercent > 60) {
			System.out.println("Chemistry: PASS, Biology: PASS");
		} else {
			System.out.println("ALL PASS");
		}

		System.out.println(resultTotal);
		System.out.println(percentage);
	}

}
