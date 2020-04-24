package string;

public class StringMethod9 {

	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 = "World";
		String s3 = "O";
		String s4 = "o";		
		boolean num1 = s1.endsWith(s4);
		boolean num2 = s1.endsWith(s3);
		boolean num3 = s2.endsWith("ld");
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);

	}

}


