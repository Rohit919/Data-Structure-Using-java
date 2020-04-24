package StringQuestion;

import java.util.Scanner;

public class RemoveWhiteSpacesFromAString1 {

	public static void main(String[] args) {
		System.out.println("Enter the String : -");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		char[] str1=new char[str.length()];
		str1 = str.toCharArray();
		int count =removeSpaces(str1);
		System.out.println("Total number of space: -"+(str.length()-count));
		System.out.println("String after removing all the white spaces :");
		System.out.println(String.valueOf(str1).subSequence(0, count));

	}

	static int removeSpaces(char[] str) {
		int count = 0;
		for (int i = 0; i < str.length; i++) {
			if (str[i] != ' ') {
				str[count++] = str[i];
			}
		}
		return count;
	}

}
