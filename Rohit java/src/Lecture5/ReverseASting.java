package Lecture5;

import java.util.Scanner;

public class ReverseASting {

	public static void main(String[] args) {
		System.out.println("Enter the string to be reverse");
		Scanner read = new Scanner(System.in);
		String str = read.nextLine();
		StringBuilder sb = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		System.out.println("Reverse string is ");
		System.out.println(sb.toString());
		String rev=sb.toString();
		if (str.equals(rev)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}
