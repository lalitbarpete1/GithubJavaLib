package demo.project;

public class NumberValidation {

	public static void main(String[] args) {
		if (isPrimeNumber(6)) {
			System.out.println("Prime number ");

		} else
			System.out.println("Not a prime number");

		for (int i = 1; i <= 100; i++) {

			if (isPrimeNumber(i)) {
				System.out.println("Prime number is " + i);
			}
		}
	}

	public static boolean isPrimeNumber(int n) {

		if (n < 2) {
			return false;

		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}

		}

		return true;
	}

}
