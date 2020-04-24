package Recursion;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		System.out.println("Enter the Number: -");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		System.out.println("Enter the exponent: -");
		int n = s.nextInt();
		System.out.println("Power of the Number is: -   " + Power(n, num));
	}

	public static int Power(int n, int num) {
		if (n == 0) { // Base case
			return 1;
		}
		int pnum1 = Power(n - 1, num);
		int pn = num * pnum1;
		return pn; // or return num*Power(n-1);
	}

}
