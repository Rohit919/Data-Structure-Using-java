package Lecture5;

import java.util.Scanner;

public class AsciDifference {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String str = read.nextLine();
		System.out.println(asciidiff(str));
	}
	public static String asciidiff(String str) {
		StringBuilder sb = new StringBuilder();
		char prev = str.charAt(0);
		for (int i = 1; i < str.length(); i++) {
			char cc = str.charAt(i);
			sb.append(prev);
			sb.append(cc-prev);
			prev = cc;
		}
		sb.append(prev);
		return sb.toString();
	}

}
