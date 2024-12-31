package demo.project;
public class StringManupulation {

	public static void main(String[] args) {
		reverstring("level");
		reverseStringOnSamePlace(" HI i Love java");
		ReverseStringOrder("HI BALE BALE"); 

	}

	public static void reverstring(String str) {
		int strlenth = str.length();
		String rev = "";
		System.out.println("Actual String is " + str);
		for (int i = strlenth - 1; i >= 0; i--) {

			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
		if (rev.equals(str)) {
			System.out.println("Both are same");
		}
	}

	public static void reverseStringOnSamePlace(String str) { // input " i am don"
																// Output = i ma nod

		String[] arr = str.split(" ");
		int arrlenth = arr.length;
		String rev = "";

		for (int i = 0; i < arrlenth; i++)

		{
			int lentharr = arr[i].length();
			for (int j = lentharr - 1; j >= 0; j--) {
				rev = rev + arr[i].charAt(j);
			}
			rev = rev + " ";

		}
		System.out.println(rev);

	}

	public static void ReverseStringOrder(String str) {
		String [] arr =  str.split(" ");
		int arrlenth = arr.length;
		String rev = "";
		
		for (int i = arrlenth-1; i >=0; i-- )
		{
			rev = rev + arr[i] +  " ";
		}
		System.out.println(rev);
		
	}
}
