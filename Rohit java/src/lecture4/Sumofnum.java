package lecture4;

import java.util.Scanner;

public class Sumofnum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long num=s.nextLong();
		long power=1, rem;
		long newnum=0;
		if(num==0){
		    System.out.print(5);
		}
		else{
		while(num>0) {
			rem=(long) (num%10);
			num=num/10;
			if(rem==0){
			    rem=5;
			    newnum+=power*rem;
			}
			else{
			    newnum+=power*rem;
			}
			power*=10;
		}
		System.out.print(newnum);
		}
	}

}
