package Rohit;

import java.util.Scanner;

public class Tocheckchar {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char ch=s.next().charAt(0);
		int num = ch;
		System.out.println(num);
		if(num>=97&&num<=122) {
			System.out.println("lowercase");
		}
		else if(num>=65&&num<=89) {
			System.out.println("UPPERCASE");
		}
		else {
			System.out.println("Invalid");
		}
	
	}

}
