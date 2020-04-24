package string;

public class StringMethod8 {

	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 = "World";
		String s3 = "h";
		String s4 = "H";		
		boolean num1 = s1.startsWith(s4);
		boolean num2 = s1.startsWith(s3);
		boolean num3 = s2.startsWith("Wo");
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);

	}

}