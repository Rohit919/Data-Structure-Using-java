package Week3;
//This program is related to the generation of Fibonacci numbers.
import java.util.Scanner; //This package for reading input

public class Fibonacci {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // Read an integer
		System.out.println(fib(n)); // Generate and print the n-th Fibonacci
									// number
	}

	static int fib(int n) {
		int num1 = 0;
		int num2 = 1;
		int num3 =0 ;
		for (int i = 0; i < n - 1; i++) {
		    num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
		}
		return num1;
	}
}