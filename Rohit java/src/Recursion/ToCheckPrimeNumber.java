package Recursion;

import java.util.Scanner;

public class ToCheckPrimeNumber {

	public static void main(String[] args) {
		System.out.println("Enter the Decimal number: -");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
        if (isPrime(n, 2))  
            System.out.println("Yes"); 
        else 
            System.out.println("No"); 

	}
	 static boolean isPrime(int n, int i) 
	    { 
	        if (n <= 2) 
	            return (n == 2) ? true : false; 
	        if (n % i == 0) 
	            return false; 
	        if (i * i > n) 
	            return true;  
	        return isPrime(n, i + 1); 
	    } 

}
