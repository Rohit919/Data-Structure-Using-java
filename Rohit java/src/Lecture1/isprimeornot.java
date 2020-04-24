package Lecture1;

import java.util.Scanner;

public class isprimeornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0, i;
		System.out.println("Enter the number ");
		Scanner s = new Scanner(System.in);
		int b = s.nextInt();
		for (i = 1; i <= b; i++) {
			if (b % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("number is prime ");
		} else
			System.out.println("Number is not a prime number ");

	}
}