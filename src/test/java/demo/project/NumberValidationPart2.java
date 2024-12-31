package demo.project;

public class NumberValidationPart2 {

	public static void main(String[] args) {

		//isFibinaci(12);
		findFactorial(5);
	}

	public static void isFibinaci(int n) {
		int num1 = 0;
		int num2 = 1;
		int num3;
		int counter = 1;

		while (counter < n) {
			System.out.println(num1 + " ");
			num3 = num2 + num1;
			num1 = num2;
			num2 = num3;
			counter++;
		}
	}

	public static void findFactorial(int n) {
		int fac = 1;
		for (int i = 1; i <= n; i++) {
			fac = fac * i;

		}
		System.out.println(fac);

	}
}
