package Recursion;

import java.util.Scanner;

public final class ChocolateAndWrapperPuzzle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the money : -");
		int money = s.nextInt();
		System.out.println("Enter the price of one chocolates: -");
		int price = s.nextInt();
		System.out.println("Enter the wrappers required: -");
		int wrap = s.nextInt();
		System.out.print("Total number of chocolate: - ");
		System.out.println(countMaxChoco(money, price, wrap)); 

	}

	static int countRec(int choc, int wrap) {

		// If number of chocolates is less than
		// number of wrappers required.
		if (choc < wrap)
			return 0;
		// We can immediatly get newChoc using
		// wrappers of choc.
		int newChoc = choc / wrap;
		// Now we have "newChoc + choc%wrap"
		return newChoc + countRec(newChoc + choc % wrap, wrap);
	}

	static int countMaxChoco(int money, int price, int wrap) {

        // We can directly buy below number of chocolates 
		int choc = money / price;
        // countRec returns number of chocolates 
		return choc + countRec(choc, wrap);
	}

}
