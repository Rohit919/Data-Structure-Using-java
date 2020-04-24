package lecture3;

public class FtoC {

	public static void main(String[] args) {
		int F;
		for(F=0;F<=300;F=F+20) {
		int	C=(int) ((5.0/9)*(F-32));
			System.out.println(F+"\t"+C);
		}

	}

}
