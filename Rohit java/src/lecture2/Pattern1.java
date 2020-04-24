package lecture2;

public class Pattern1 {

	public static void main(String[] args) {
		int row=1;
		int nst=5;
		while(row<=5) {
			int cst=1;
			while(cst<=nst) {
				System.out.print("*");
				cst++;
			}
			System.out.println();
			row++;
		}

	}

}
