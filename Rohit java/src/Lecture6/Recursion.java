package Lecture6;

public class Recursion {

	public static void main(String[] args) {
		int n = 5, x=2, nth=3, num1=0,num2=1;
		PDISKIP(n);
		int fact = 1;
		Fact(n , fact);
		power(n,x);
		fib(n , num1, num2);

	}
	public static void PDISKIP(int n) {
		if(n<0) {
			return;
		}
		System.out.println(n);
		PDISKIP(n-2);
		System.out.println(n-1);
	}
	public static void Fact(int n ,int fact) {
		if(n==0) {
			System.out.println(fact);
			return;
		}
		fact=fact*n;
		Fact(n-1, fact);
	}
	public static void power(int n ,int x) {
		if(n==1) {
			System.out.println(x);
			return;
		}
		x=x*2;
		power(n-1, x);
	}
	public static void fib(int n ,int num1, int num2) {
		if(n==1) {
			System.out.println(num2);
			return;
		}
		int nth=num1+num2;
		num1=num2;
		num2=nth;
		fib(n-1, num1, num2);
		
	}
}
