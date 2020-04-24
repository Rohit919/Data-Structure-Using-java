package ExceptionHandiling;

import java.util.Scanner;
public class Pattern1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many rows you want in this pattern?");
		int rows = sc.nextInt();
		int count = 2;
		for (int i = 1; i <= rows; i++){
		    count = count + 1;
			for (int j = 1; j <= i; j++){
				System.out.print(count + " ");
				count = count + 1;
			}
			System.out.println();
		}
		sc.close();
	}
}