package Lecture1;

import java.util.Scanner;

public class nthFibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0, num2=1, i, j=0;
		System.out.println("Enter the number of term ");
		Scanner s = new Scanner(System.in);
		int b=s.nextInt();
		for(i=0;i<b;i++) {
			j=num1+num2;
			num1=num2;
			num2=j;
					
		}
		System.out.println(j);
		
	}

}
