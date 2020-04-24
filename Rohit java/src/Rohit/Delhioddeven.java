package Rohit;

import java.util.Scanner;

public class Delhioddeven {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N=s.nextInt();
		while(N>0) {
			int sum1=0, sum2=0;
			int num=s.nextInt();
			while(num!=0) {
				int rem=num%10;
				if(rem%2==0) {
					sum1 =sum1+rem;
				}
				else {
					sum2 =sum2 + rem;
				}
				num=num/10;
			}
			if(sum1%4==0||sum2%3==0) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
			N--;
		}
	}

}
