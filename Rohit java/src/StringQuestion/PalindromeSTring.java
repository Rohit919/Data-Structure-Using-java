package StringQuestion;

import java.util.Scanner;

public class PalindromeSTring {

	public static void main(String[] args) {
		String reverse = "";
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string to check if it is a palindrome");
		String str = in.nextLine();
		str = str.toLowerCase();
		for (int i = str.length() - 1; i >= 0; i--)
			reverse = reverse + str.charAt(i);

		if (str.equals(reverse))
			System.out.println("The string is a palindrome.");
		else
			System.out.println("The string isn't a palindrome.");

	}

}
