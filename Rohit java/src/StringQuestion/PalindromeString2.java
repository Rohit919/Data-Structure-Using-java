package StringQuestion;

import java.util.Scanner;

public class PalindromeString2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string to check if it is a palindrome");
		String string = in.nextLine();
        boolean flag = true;  
        string = string.toLowerCase();
        for(int i = 0; i < string.length()/2; i++){  
            if(string.charAt(i) != string.charAt(string.length()-i-1)){  
                flag = false;  
                break;  
            }  
        }  
        if(flag)  
            System.out.println("Given string is palindrome");  
        else  
            System.out.println("Given string is not a palindrome");  
	}

}
