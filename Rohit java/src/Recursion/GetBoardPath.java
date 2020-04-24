package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class GetBoardPath {

	public static void main(String[] args) {
		System.out.println("Enter the Starting Point : -");
		Scanner s = new Scanner(System.in);
		int start = s.nextInt();
		System.out.println("Enter the end Point : -");
		int end = s.nextInt();
		System.out.println(getBoardPath(end, start));
		System.out.println(getBoardPath(end, start).size());

	}
	public static ArrayList<String> getBoardPath(int end, int curr) {
		if (end == curr) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		if (curr > end) {
			ArrayList<String> br = new ArrayList<>();
			return br;
		}

		ArrayList<String> recResult = null;
		ArrayList<String> myResult = new ArrayList<>();
		for (int dice = 1; dice <= 6; dice++) {
			recResult = getBoardPath(end, curr + dice);
			for (int i = 0; i < recResult.size(); i++) {
				myResult.add(dice + recResult.get(i));
			}
		}

		return myResult;
	}

}
