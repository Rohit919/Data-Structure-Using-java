package ExceptionHandiling;

public class TryCatchExamle4 {

	public static void main(String[] args) {
		try {
			int data = 50/0; //Exception occurs
		}
		catch(Exception e) {
			System.out.println("can't devided by zero");
		}

	}

}
