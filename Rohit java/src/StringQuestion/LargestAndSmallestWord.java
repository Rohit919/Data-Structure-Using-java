package StringQuestion;

import java.util.Scanner;

public class LargestAndSmallestWord {

	public static void main(String[] args) {
		System.out.println("Enter the string:");
		Scanner read = new Scanner(System.in);
		String string = read.nextLine();
        String word = "", small = "", large="";  
        String[] words = new String[100];  
        int length = 0;     
        //Add extra space after string to get the last word in the given string  
        string = string + " ";  
          
        for(int i = 0; i < string.length(); i++){  
            //Split the string into words  
            if(string.charAt(i) != ' '){  
                word = word + string.charAt(i);  
            }  
            else{  
                //Add word to array words  
                words[length] = word;  
                //Increment length  
                length++;  
                //Make word an empty string  
                word = "";  
            }  
        }  
        //Initialize small and large with first word in the string  
        small = large = words[0];  
          
        //Determine smallest and largest word in the string  
        for(int k = 0; k < length; k++){  
            if(small.length() > words[k].length())  
                small = words[k];  

            if(large.length() < words[k].length())  
                large = words[k];  
        }  
          
        System.out.println("Smallest word: " + small+"\tLength="+small.length());  
        System.out.println("Largest word: " + large+"\tLength="+large.length());  
	}

}
