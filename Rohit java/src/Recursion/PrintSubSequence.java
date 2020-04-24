package Recursion;

import java.util.Scanner;

public class PrintSubSequence {

	public static void main(String[] args) {
		System.out.println("Enter the String : -");
		Scanner s = new Scanner(System.in);
		String Str = s.nextLine();
		printSS( Str, "");

	}
	public static void printSS(String str, String res) {
		if (str.length() == 0) {
			System.out.println(res);
			return;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);

		printSS(ros, res);
		printSS(ros, res + cc);
	}

}
