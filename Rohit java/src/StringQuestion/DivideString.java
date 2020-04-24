package StringQuestion;

import java.util.Scanner;

public class DivideString {

	public static void main(String[] args) {
		System.out.println("Enter the String : -");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int len = str.length();
		System.out.println("Enter the N to divide N equal part: - ");
		int n = s.nextInt();
		int temp = 0, chars = len / n;
		String[] equalStr = new String[n]; // array of string
		if (len % n != 0) {
			System.out.println("Sorry this string cannot be divided into " + n + " equal parts.");
		} else {
			for (int i = 0; i < len; i = i + chars) {
				String part = str.substring(i, i + chars);
				equalStr[temp] = part;
				temp++;
			}
			System.out.println(n + " equal parts of given string are ");
			for (int i = 0; i < equalStr.length; i++) {
				System.out.println(equalStr[i]);
			}
		}
	}

}
