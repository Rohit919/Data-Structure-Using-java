package Lecture5;

import java.util.Scanner;

public class CountString {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String str = read.nextLine();
		int[] count= new int [100];
		for (int i = 1; i < str.length(); i++) {
			count[str.charAt(i)]++;
		}
		int max=-1;
		char result = 0;
		for (int i = 1; i < str.length(); i++) {
			if(max<count[str.charAt(i)]) {
				max=count[str.charAt(i)];
				result=str.charAt(i);
			}
		}
		System.out.println(result);
	}

}
