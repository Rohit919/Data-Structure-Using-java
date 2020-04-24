package StringQuestion;

import java.util.Scanner;

public class ReplaceSpace1 {

	public static void main(String[] args) {
		System.out.println("Enter the String : -");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		char[] str1 = new char[str.length()];
		str1 = str.toCharArray();
		removeSpaces(str1);
		System.out.println("String after replacing all the white spaces :");
		System.out.println(String.valueOf(str1).subSequence(0, str1.length));

	}

	static void removeSpaces(char[] str) {
		for (int i = 0; i < str.length; i++) {
			if (str[i] == ' ') {
				str[i] = '_';
			}
		}
	}

}
