package ExceptionHandiling;

public class TryCatchExample5 {

	public static void main(String[] args) {
		int i = 50;
		int j = 0;
		int data;
		try {
			data = 50/0; //throw Exception
		}
		catch(Exception e) {
			data = i/(j+2);
			System.out.println(data);
		}
	}

}
