package StringQuestion;

import java.util.Scanner;

public class MoveAllUpperCaseInLastOfString {

	public static void main(String[] args) {
		System.out.println("Enter the string:");
		Scanner read = new Scanner(System.in);
		String str = read.nextLine();
		System.out.println("Before Operation:   " + str);
		System.out.println("After Operation:    " + move(str));
	}

	static public String move(String str) {
		int len = str.length();
		String low = "";
		String upr = "";
		char ch;
		for (int i = 0; i < len; i++) {
			ch = str.charAt(i);
			// check char is in uppercase or lower case
			if (ch >= 'A' && ch <= 'Z') {
				upr += ch;
			} else {
				low += ch;
			}
		}
		return low + upr;
	}

}
