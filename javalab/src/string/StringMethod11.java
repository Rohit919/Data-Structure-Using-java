package string;

public class StringMethod11 {

	public static void main(String[] args) {

		String s1 = "Hello World";
		String s2 = "String is an immutable object which means string is constant and cannot be changed";
		int num1 = s1.lastIndexOf('l');
		int num2 = s2.lastIndexOf("string");
		int num3 = s2.lastIndexOf("is");
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);

	}

}