package StringQuestion;

import java.util.Scanner;

public class CountOccurences {
	public static void main(String[] args) {
		System.out.println("Enter the String : -");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println("Enter the word : -");
		String word = s.nextLine();
		System.out.println(countOccurences(str, word));
	}
	static int countOccurences(String str, String word) {
		// split the string by spaces in a
		String a[] = str.split(" ");
		// search for pattern in a
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (word.equals(a[i])) {
				count++;
			}
		}
		return count;
	}

}
