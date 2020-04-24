package lecture2;

import java.util.Scanner;

public class Pattern0001 {

	public static void main(String[] args) {
		int i, j;
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		i = 1;
		while (i <= N) {
			j = 1;
			while (j <= i) {
				if (j == 1 || j == i) {
					System.out.print(i + "\t");
				} else {
					System.out.print("0\t");
				}
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
