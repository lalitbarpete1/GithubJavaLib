package demo.project;

public class ReverseArray {
	public static void main(String[] args) {

		int[] arr1 = new int[] { 1, 2, 3, 4, 5 };

		System.out.println(" array before the revers is ");
		for (int i = 0; arr1.length > i; i++) {
			System.out.print(arr1[i]);

		}
		System.out.println();
		System.out.println(" array After the revers is");
		for (int i = arr1.length - 1; i >= 0; i--)

		{
			System.out.print(arr1[i]);
		}

	}
}
