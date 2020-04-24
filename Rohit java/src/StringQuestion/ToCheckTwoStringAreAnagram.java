package StringQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class ToCheckTwoStringAreAnagram {

	public static void main(String[] args) {
		System.out.println("Enter the First String : -");
		Scanner s = new Scanner(System.in);
		String str1 = s.nextLine();
		System.out.println("Enter the Secand String : -");
		String str2 = s.nextLine();
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		if (str1.length() != str2.length()) {
			System.out.println("Both the strings are not anagram");
		} else {
			// Converting both the string to character array
			char[] string1 = str1.toCharArray();
			char[] string2 = str2.toCharArray();
			// Sorting the arrays using function sort ()
			Arrays.sort(string1);
			Arrays.sort(string2);
			if (Arrays.equals(string1, string2) == true) {
				System.out.println("Both the strings are anagram");
			} else {
				System.out.println("Both the strings are not anagram");
			}
		}
	}
}
