package lecture3;

import java.util.Scanner;

public class BinarytoDecimal {

	public static void main(String[] args) {
		int sum=0,rem, num1=1 ;
		System.out.println("Enter the binary number ");
		Scanner s = new Scanner(System.in);
		int num=s.nextInt();
		while(num !=0) {
			rem = num%10;
			num = num/10;
			sum = sum + (rem*num1);
			num1=num1*2;
		}
		System.out.println(sum);

	}

}
