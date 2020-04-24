package lecture2;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		int row=1;
		int nst=1;
		Scanner s = new Scanner(System.in);
		int N=s.nextInt();
		while(row<=N) {
			int cst=1;
			while(cst<=nst) {
				
				if(cst%2==0) {
					System.out.print("*");
				}	
				else {
					System.out.print(row);
					
				}
				cst++;
			}
			System.out.println();
			row++;
			nst=nst+2;
		}	
	}

}
