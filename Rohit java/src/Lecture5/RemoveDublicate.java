package Lecture5;

import java.util.Scanner;

public class RemoveDublicate {

	public static void main(String[] args) {
		System.out.println("Enter the string to be change");
		Scanner read = new Scanner(System.in);
		String str = read.nextLine();
		StringBuilder sb = new StringBuilder();
		char c1, c2=0,c3;
		for (int i = 0; i <= str.length() - 1; i++) {
			 c1 = str.charAt(i);
			 c3=c2;
			 c2=c1;
			if (c3!=c2) {
				sb.append(c2);
			}
		}
		System.out.println(" string is ");
		System.out.println(sb.toString());

	}

}
