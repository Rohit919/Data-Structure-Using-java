package StringQuestion;

import java.util.Scanner;

public class IndividualCharecter {

	public static void main(String[] args) {
		System.out.println("Enter the string:");
		Scanner read = new Scanner(System.in);
		String string = read.nextLine();
		System.out.println("Individual characters from given string:");
		for (int i = 0; i < string.length(); i++) {
			System.out.print(string.charAt(i) + "  ");
		}
	}
}
