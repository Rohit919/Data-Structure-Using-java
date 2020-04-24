package dataType;

public class DataTypeInJava {

	public static void main(String[] args) {
		System.out.println("**********Part-1***********");
		byte by = 58;
		short sh = 458;
		int in = 14582;
		long lo = 500000000000000l;
		float f = 15.452f;
		double d = 456.8546;
		System.out.println("Long: " + lo);  
        System.out.println("integer: " + in);  
        System.out.println("byte: " + by);  
        System.out.println("short: " + sh);  
        System.out.println("float: " + f);  
        System.out.println("double: " + d);
        
        System.out.println("**********Part-2***********");
        byte a = 126; 
        System.out.println(a); 
        a++; 
        System.out.println(a);   
        a++; 
        System.out.println(a); 
        a++; 
        System.out.println(a); 
        
        System.out.println("**********Part-3***********");
        char ch = 'a';
		ch = 99;
		System.out.println(ch);
		ch = (char) (ch+2);
		System.out.println(ch);
		ch = (char) 69000;
		System.out.println("69000 in char is" + ch);
		in = ch;
		System.out.println(in);
		//ch = in;
		ch = (char) in;
		System.out.println(ch);
		in = ch + 2;
		System.out.println(in);
	   // ch = ch + 2;
		ch = (char) (ch + 2);
		System.out.println(ch);
		
		System.out.println("**********Part-4***********");
		boolean bl = true;
		// bl = 0;
		// bl = 1;
		if (bl) {
			System.out.println("hi");
		} else {
			System.out.println("bye");
		}
		bl = false;
		if (bl) {
			System.out.println("hi");
		} else {
			System.out.println("bye");
		}

		System.out.println("**********Part-5***********");
		String str;
		str = "Hello";
		System.out.println(str);

	}

}
