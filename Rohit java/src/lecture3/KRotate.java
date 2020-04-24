package lecture3;

import java.util.Scanner;

public class KRotate {

	public static void main(String[] args) {
		System.out.println("Enter the number ");
		Scanner s = new Scanner(System.in);
		int num=s.nextInt();
		System.out.println("Enter the number of rotation ");
		int k=s.nextInt();
        int nod=0;
        int n=num;
        while(n!=0) {
        	nod++;
        	n=n/10;
        }
       // System.out.println(nod);
        
        k=k%nod;
        if(k<0) {
        	k=k+nod;
        }
        
        int divisor=(int)Math.pow(10, k);
        int rem=num%divisor;
        num=num/divisor;
        int ans=rem*(int)Math.pow(10, nod-k)+num;
        System.out.println(ans);
        
	}

}
