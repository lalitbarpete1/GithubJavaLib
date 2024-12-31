package demo.project;

public class Demo {
	public static void main(String[] args) {
		String str = "Lalit";
		int strlen = str.length();
		int countercon = 0;
		int coutnervov = 0;

		for (int i = 0; i <= strlen; i++) {
			if (str.charAt(i) == 'a') {
				coutnervov++;
			
			}
			else if (str.charAt(i) == 'i') {
				coutnervov++;
			
			}
			else if (str.charAt(i) == 'e') {
				coutnervov++;
				
			}
			else if (str.charAt(i) == 'o') {
				coutnervov++;
			
			}
			else if (str.charAt(i) == 'u') {
				coutnervov++;
			
			} else
				countercon++;
			
		}
		System.out.println("Con are " + countercon);
		System.out.println("vov are " + coutnervov);
	}

}
