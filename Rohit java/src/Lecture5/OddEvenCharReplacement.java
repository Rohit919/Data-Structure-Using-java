package Lecture5;

import java.util.Scanner;

public class OddEvenCharReplacement {

	public static void main(String[] args) {
		System.out.println("Enter the string to be change");
		Scanner read = new Scanner(System.in);
		String str = read.nextLine();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= str.length() - 1; i++) {
			char c1 = str.charAt(i), c2;
			if (i%2==0) {
				c2= (char) (c1+1);
			} else {
				c2=(char) (c1-1);
			}

			sb.append(c2);
		}
		System.out.println(" string is ");
		System.out.println(sb.toString());


	}

}
