package layout;

public class WFEW {
	private static int i=0;
	private static int j=0;

	public static void main(String[] ags) {
		int i=4;
		int k=5;
		{
			int j=3;
			System.out.println("i + j is "+i +j);
		}
		k=i+j;
		System.out.println(k);
		System.out.println(j);

	}

}
