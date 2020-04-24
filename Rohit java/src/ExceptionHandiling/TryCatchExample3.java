package ExceptionHandiling;

public class TryCatchExample3 {

	public static void main(String[] args) {
		try {
			int data = 30/0; //throw exception
			System.out.println("Rest of the line....");//Not executed
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}

	}

}
