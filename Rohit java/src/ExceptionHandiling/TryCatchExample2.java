package ExceptionHandiling;

public class TryCatchExample2 {

	public static void main(String[] args) {
		try {
			int data=20/0;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Rest of the code........");

	}

}
