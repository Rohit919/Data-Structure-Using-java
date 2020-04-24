package StringQuestion;

import java.util.Scanner;

public class RotationOfString2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a first string ");
		String str1 = in.nextLine(); 
		System.out.println("Enter a rotated string ");
		String str2 = in.nextLine();
		if (areRotations(str1, str2)) 
            System.out.println("Strings are rotations of each other"); 
        else
            System.out.printf("Strings are not rotations of each other"); 
	}
	static boolean areRotations(String str1, String str2) 
    {   
        return (str1.length() == str2.length()) && 
               ((str1 + str1).indexOf(str2) != -1); 
    } 

}
