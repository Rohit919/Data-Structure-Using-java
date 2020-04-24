package Lecture5;

import java.util.Scanner;

public class Stringprintchar {

	public static void main(String[] args) {
		System.out.println("Enter the String : -");
		Scanner s = new Scanner(System.in);
		String Str = s.nextLine();
		System.out.println("All subsets for given string are:");
		for (int i = 0; i < Str.length(); i++) {
			for (int j = i; j < Str.length(); j++) {
				System.out.println(Str.substring(i, j + 1));
			}
		}
	}
}
