//Write a Java program and compute the sum of the digits of an integer.

package basic1;

import java.util.Scanner;

public class Que1 {

	public static void main(String[] args) {
		System.out.println("Enter the a integer number: -");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		while (num > 0) {
			int rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		System.out.println("Sum of Digits is = " + sum);
		sc.close();

	}

}
