package Lecture1;

import java.util.Scanner;

public class HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lcm, num11, num22;
		System.out.println("Enter the two number ");
        Scanner s = new Scanner(System.in);
		int num1=s.nextInt();
		int num2=s.nextInt();
		num11=num1;
		num22=num2;
		while(num1!=num2) {
			if(num1>num2) {
				num1=num1-num2;
			}
			else {
				num2=num2-num1;
			}	
		}
		lcm=num11*num22/num1;
		System.out.println(lcm);
		
	}
}
