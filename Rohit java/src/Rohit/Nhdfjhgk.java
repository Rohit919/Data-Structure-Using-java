package Rohit;

import java.util.Scanner;

public class Nhdfjhgk {

	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int N=s.nextInt();
			
			for (int i=0;i<N;i++){
				long rem, num1=1 ;
				long sum=0;
			    long num=s.nextLong();
			    while(num !=0) {
				rem = num%10;
				num = num/10;
				sum = sum + (rem*num1);
				num1=num1*2;
			    }
			System.out.println(sum);
			}

	}

}
