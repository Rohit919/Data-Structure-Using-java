package string;

public class StringMethod7 {

	public static void main(String[] args) {

		String s1 = "boy";
		String s2 = "box";
		String s3 = "boy";
		String s4 = "Boy";
		boolean num1 = s1.equalsIgnoreCase(s2);
		boolean num2 = s1.equalsIgnoreCase(s3);
		boolean num3 = s1.equalsIgnoreCase(s4);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);

	}

}