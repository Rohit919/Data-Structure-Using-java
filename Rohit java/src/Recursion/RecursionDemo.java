package Recursion;

public class RecursionDemo {

	public static void main(String[] args) {
		int n = 5;
		PD(n);
		System.out.println("****************");
		PI(n);
		System.out.println("****************");
		PDI(n);
		System.out.println("****************");
		PDISKIP(n);
	}

	public static void PD(int n) {
		if (n == 0) {
			return;
		}
		System.out.println(n);
		PD(n - 1);
	}
	public static void PI(int n) {
		if (n == 0) {
			return;
		}
		PI(n - 1);
		System.out.println(n);
	}
	public static void PDI(int n) {
		if (n == 0) {
			return;
		}
		System.out.println(n);
		PDI(n - 1);
		System.out.println(n);
	}
	public static void PDISKIP(int n) {
		if (n == 0) {
			return;
		}
		if(n%2==1) {
			System.out.println(n);
		}
		PDISKIP(n - 1);
	if(n%2==0) {
		
	}
	}

}
