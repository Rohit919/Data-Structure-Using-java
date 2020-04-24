package Rohit;

import java.util.Scanner;

public class Decinc {

	public static void main(String[] args) {
		int i, j;
        int max=1000000000;
        Scanner s = new Scanner(System.in);
		int N=s.nextInt();
		int num=s.nextInt();
		for(i=1;num<max&&i<=N;i++){
		    max=num;
		    if(i==N){
		        System.out.println("true");
		        break;
		    }
		    int num1=s.nextInt();
		    num=num1;
		}
		int min=0;
		for(j=1;num>min&&j<=N-i;j++){
		    min=num;
		    if(j==N){
		        System.out.println("true");
		        break;
		    }
		    int num2=s.nextInt();
		    num=num2;
		}
		if(i+j-1==N){
		    System.out.println("true");
		}
		else{
		    System.out.println("false");
		}


	}

}
