package StringQuestion;

import java.util.Scanner;

public class RotationOfString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a first string ");
		String str1 = in.nextLine(); 
		System.out.println("Enter a rotated string ");
		String str2 = in.nextLine();
        if(str1.length() != str2.length()){  
            System.out.println("Second string is not a rotation of first string");  
        }  
        else {  
            //Concatenate str1 with str1 and store it in str1  
            str1 = str1.concat(str1);  
              
            //Check whether str2 is present in str1  
            if(str1.indexOf(str2) != -1)  
                System.out.println("Second string is a rotation of first string");  
            else  
                System.out.println("Second string is not a rotation of first string");  
        }  

	}

}
