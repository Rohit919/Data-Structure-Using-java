package StringQuestion;

public class FirstUpperCase {

	public static void main(String[] args) {
		String str = "aaarohiTaaaabbB"; 
        char res = first(str,0); 
        if (res == 0) 
            System.out.println("No uppercase letter"); 
        else
            System.out.println (res ); 
	}
	static char first(String str, int i) 
    { 
        if (str.charAt(i) == '\0') 
            return 0; 
        if (Character.isUpperCase(str.charAt(i)))  
                return str.charAt(i); 
        return first(str, i + 1); 
    } 

}
