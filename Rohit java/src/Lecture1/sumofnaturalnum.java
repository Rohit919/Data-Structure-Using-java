package Lecture1;

import java.util.Scanner;

public class sumofnaturalnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		System.out.println("Enter the number of natural number");
		Scanner s = new Scanner(System.in);
		int b=s.nextInt();
		for(int i=1;i<=b;i++)
		{
			sum = sum + i;
			
		}
		System.out.println(sum);
	}

}
