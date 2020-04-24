package lecture2;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		int row=1;
		Scanner S = new Scanner(System.in);
		int N=S.nextInt();
		int nst=2*N-1;
		int i=N-1;
		while(row<=N) {
			int cst=1;
			int j=row;
			while(cst<=nst) {
				if(cst<=row) {
					j++;
				}
				else {
					j--;
				}
				System.out.print(j);
				cst++;
			}
			System.out.println();
			while(i<=row) {
				System.out.print(" ");
				i++;
			}
			i=row-1;
			row++;
			nst--;
		}	


	}

}
