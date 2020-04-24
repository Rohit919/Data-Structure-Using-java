package lecture2;
import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		int i=1;
		int row=1;
		Scanner s = new Scanner(System.in);
		int N=s.nextInt();
		int nst=N;
		while(row<=N) {
			int cst=1;
			while(cst<=nst) {
				System.out.print("*");
				cst++;
			}
			System.out.println();
			while(i<=row) {
				System.out.print("  ");
				i++;
			}
			i=1;
			row++;
			nst--;
		}	

	}

}
