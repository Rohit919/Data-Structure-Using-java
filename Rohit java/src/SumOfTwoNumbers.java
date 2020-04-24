import java.util.*;

public class SumOfTwoNumbers {

	public static void main(String[] args) {
		int a = 4;
		int b = 3;
		int sum = a + b;
		System.out.println(sum);
		System.out.println("*****************************");
		System.out.println("Sum of two integer = " + sum);
		System.out.println("*****************************");
		System.out.println("The given number are a = "+a+"and b = "+b+" and the sum is "+sum);
		System.out.println("*****************************");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("sum = "+sum);
		System.out.println("*****************************");
		System.out.println("a\tb\tsum");
		System.out.println(a+"\t"+b+"\t"+sum);
		Scanner s = new Scanner(System.in);
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		int sum1 = num1+num2;
		System.out.println(sum);

	} 
} 
