package lecture4;

public class Function4 {
	static int global_var=10;   //Global Variable

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println(a + ", " + b);
		swap(a, b);
		System.out.println(a + ", " + b);
	}
	public static void swap(int a, int b) {  
		System.out.println(a + ", " + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println(a + ", " + b);
		System.out.println(global_var);
	}

}
