package ExceptionHandiling;

public class MultipleCatchBlockExample2 {

	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			a[5] = 50/0;
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
		}
		catch(Exception e) {
			
		}

	}

}