package Rohit;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		int SimpleInterest;
		System.out.println("Enter the principle");
		Scanner s = new Scanner(System.in);
		int P=s.nextInt();
		System.out.println("Enter the rate");
		int R=s.nextInt();
		System.out.println("Enter the time");
		int T=s.nextInt();
		SimpleInterest = P*R*T/100;
		System.out.println("Simple Interest\t"+SimpleInterest);
	}

}
