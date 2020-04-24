package Rohit;

import java.util.Scanner;

public class MinInvertingNum {

	public static void main(String[] args) {
		long inver=0, rem, digit = 0, rev=0;
		System.out.println("Enter the number ");
		Scanner s = new Scanner(System.in);
		long num=s.nextLong();
		long n=num;
		while(n!=0) {
			digit=n%10;
			n=n/10;
		}
		while(num!=0) {
			rem=num%10;
			if(rem>digit) {
				rem=9-rem;
				inver=inver*10+rem;
			}
			else {
				inver=inver*10+rem;
			}
			num=num/10;
		}
		long b= inver;
		while(b!=0) {
			rem=b%10;
			rev=rev*10+rem;
			b=b/10;
		}
		System.out.println(b);
	}
	
}
