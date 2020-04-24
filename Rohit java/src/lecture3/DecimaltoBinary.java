package lecture3;

import java.util.Scanner;

public class DecimaltoBinary {

	public static void main(String[] args) {
		int sum=0,rem, num1=1 ;
		System.out.println("Enter the Decimal number");
		Scanner s = new Scanner(System.in);
		int num=s.nextInt();
		while(num !=0) {
			rem = num%2;
			num = num/2;
			sum = sum + (rem*num1);
			num1=num1*10;
		}
		System.out.println(sum);
	s.close();
	}


}
