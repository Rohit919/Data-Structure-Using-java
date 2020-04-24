package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class SubsequenceWithAscii {

	public static void main(String[] args) {
		System.out.println("Enter the String : -");
		Scanner s = new Scanner(System.in);
		String Str = s.nextLine();
		ArrayList<String> ss = getSSWAscii(Str);
		System.out.println(ss);
		System.out.println(ss.size());
	}

	public static ArrayList<String> getSSWAscii(String str) {
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> myResult = new ArrayList<>();
		ArrayList<String> recResult = getSSWAscii(ros);

		for (int i = 0; i < recResult.size(); i++) {
			myResult.add(recResult.get(i));
			myResult.add(cc + recResult.get(i));
			myResult.add((int) cc + recResult.get(i));
		}

		return myResult;
	}

}
