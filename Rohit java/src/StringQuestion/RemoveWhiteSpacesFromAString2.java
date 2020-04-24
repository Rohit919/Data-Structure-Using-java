package StringQuestion;

import java.util.Scanner;

public class RemoveWhiteSpacesFromAString2 {

	public static void main(String[] args) {
		System.out.println("Enter the String : -");
		Scanner s = new Scanner(System.in);
		String str1 = s.nextLine();
		str1 = str1.replaceAll("\\s+", "");
		System.out.println("String after removing all the white spaces : \n" + str1);

	}

}
