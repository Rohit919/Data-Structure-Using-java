package Lecture5;

import java.util.Scanner;

public class Substring {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String str = read.nextLine();
		StringBuilder sb = new StringBuilder();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length(); j++) {
				for (int k = str.substring(i, j + 1).length() - 1; k >= 0; k--) {
					sb.append(str.substring(i, j + 1).charAt(k));
				}
				String rev = sb.toString();
				if (str.substring(i, j + 1).equals(rev)) {
					count++;
				}
			}
		}
		System.out.print(count+str.length());

	}

}
