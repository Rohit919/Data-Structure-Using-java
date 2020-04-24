package StringQuestion;

import java.util.Scanner;

public class PuncutionChar {
	public static void main(String[] args) {
		System.out.println("Enter the String : -");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.'
					|| str.charAt(i) == '?' || str.charAt(i) == '-' || str.charAt(i) == '\'' || str.charAt(i) == '\"'
					|| str.charAt(i) == ':') {
				count++;
			}
		}
		System.out.println("Total number of punctuation characters exist in string = " + count);

	}

}
