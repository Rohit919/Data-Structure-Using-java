package Rohit;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char ch=s.next().charAt(0);
		int num= ch, output;
		    do {
		    if(num==88 || num==120) {
		    	break;
		    }
		    else if(num==42) {
				int num1=s.nextInt();
				int num2=s.nextInt();
				output=num1*num2;
				System.out.println(output);
			}
			else if(num==43) {
				int num1=s.nextInt();
				int num2=s.nextInt();
				output=num1+num2;
				System.out.println(output);		
		    }
			else if(num==45) {
				int num1=s.nextInt();
				int num2=s.nextInt();
				output=num1-num2;
				System.out.println(output);		
		    }
			else if(num==47) {
				int num1=s.nextInt();
				int num2=s.nextInt();
				output=num1/num2;
				System.out.println(output);		
		    }
			else if(num==37) {
				int num1=s.nextInt();
				int num2=s.nextInt();
				output=num1%num2;
				System.out.println(output);		
		    }
			else {
				System.out.println("Invalid operation. Try again");		
		    }
			char ch1=s.next().charAt(0);
			int num4= ch1;
			num = num4;
		}while(true);
	}

}
