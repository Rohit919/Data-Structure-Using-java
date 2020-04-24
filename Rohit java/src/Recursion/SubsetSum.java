package Recursion;

import java.util.Scanner;

public class SubsetSum {

	public static void main(String[] args) {
		System.out.println("Enter the number: -");
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		printSubSets(N,N,"");
	}
	public static void printSubSets(int N, int curr, String res){
        if(curr==0){
            System.out.println(res);
            return;
        }

        for (int i = 1; i <=N ; i++) {
            if(i<=curr){
                printSubSets(N, curr-i, res+i);
            }
        }
    }

}
