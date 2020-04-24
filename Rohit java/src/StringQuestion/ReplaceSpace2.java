package StringQuestion;

import java.util.Scanner;

public class ReplaceSpace2 {

	public static void main(String[] args) {
		System.out.println("Enter the String : -");
		Scanner s = new Scanner(System.in);
		String str1 = s.nextLine();
		str1 = str1.replaceAll("\\s+","_");
		System.out.println("String after replacing all the white spaces : \n" + str1);
	}

}
