package Rohit;
import java.util.Scanner;

public class Patternwithfibonacciseries {

	public static void main(String[] args) {
		 int i, j, num1=0, num2=1,n=0;
	        Scanner s = new Scanner(System.in);
			int N=s.nextInt();
	        i=1;
	        while(i<=N){
	            j=1;
	            while(j<=i){
	            	if(n==0){
	        		    System.out.print(num1+"\t");
	        		    n++;
	        		}
	        		else {
	                    int sum = num1 + num2;
	                    num1 = num2;
	                    num2 = sum;
	                    System.out.print(num1+"\t");
	                    n++;
	        		}
	                j++;
	            }
	            System.out.println();
	            i++;
	        }      
	}

}
