package Recursion;

import java.util.Scanner;

public class PrintSubSequenceWithAscii {

	public static void main(String[] args) {
		System.out.println("Enter the String : -");
		Scanner s = new Scanner(System.in);
		String Str = s.nextLine();
		printSSWAscii(Str, "");
	}
	public static void printSSWAscii(String str, String res) {
		if (str.length() == 0) {
			System.out.println(res);
			return;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);

		printSSWAscii(ros, res);
		printSSWAscii(ros, res + cc);
		printSSWAscii(ros, res + (int)cc);
	}


}
