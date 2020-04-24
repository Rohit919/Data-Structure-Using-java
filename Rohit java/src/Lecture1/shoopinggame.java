package Lecture1;

import java.util.Scanner;

public class shoopinggame {

	public static void main(String[] args) {
		int i;
		System.out.println("test");
		Scanner s = new Scanner(System.in);
		int T=s.nextInt();
		while(T>=1) {
			System.out.println("mn");
			int M=s.nextInt();
			int N=s.nextInt();
			for(i=1;M<=0&&N<=0;i++) {
				if(i%2==0) {
					N=N-i;
				}
				else {
					M=M-i;
				}
			}
			if(M<=0) {
				System.out.println("Aayush");
			}
			else {
				System.out.println("Harshit");
			}
			T--;
		}
		
	}

}
