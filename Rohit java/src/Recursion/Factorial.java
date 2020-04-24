package Recursion;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Enter the Number: -");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println("Factorial of the Number is: -   " + Fact(n));
	}

	public static int Fact(int n) {
		if (n == 0 || n == 1) { // Base case
			return 1;
		}
		int fnum1 = Fact(n - 1);
		int fn = n * fnum1;
		return fn; // or return n*Fact(n-1);
	}
}
