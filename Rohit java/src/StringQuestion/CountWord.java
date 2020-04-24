package StringQuestion;

import java.util.Scanner;

public class CountWord {

	public static void main(String[] args) {
		System.out.println("Enter the String : -");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int wordCount = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == ' ' && str.charAt(i + 1)!=' ' && (i > 0)) {
				wordCount++;
			}
		}
		wordCount++;
		System.out.println("Total number of words in the given string: " + wordCount);

	}

}
