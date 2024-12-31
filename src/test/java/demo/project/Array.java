package demo.project;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {

		int arr1[] = { 1, 2, 3, 4, 5 };

		int arrsize = arr1.length;

		Arrays.sort(arr1);
		System.out.println(arr1[arrsize - 2]);

		for (int i = arrsize - 2; i >= 0; i--) {
			if (arr1 [i] != arr1 [arrsize-1]) 
			{
				System.out.println(arr1[i]);
			}
		}

	}

}
