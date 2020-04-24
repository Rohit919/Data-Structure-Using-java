package lecture4;

public class Function2 {

	public static void main(String[] args) {
		int p=1000;
		int r=10;
		int t=1;
		si(p,r,t);
		
		int ans=si(p, r, t);
		System.out.println(ans);
	}
	public static int si(int p, int r, int t) {
		int si = (p * r * t) / 100;
		System.out.println(si);
		return si;

	}

}
