package Lecture1;
import java.util.Scanner;

public class sumofplaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumeven=0, sumodd=0, n=1, rem;
		System.out.println("Enter the number ");
        Scanner s = new Scanner(System.in);
		int num=s.nextInt();
		while(num!=0){
		    if(n/2==0){
		        rem=num%10;
		        sumeven=sumeven+rem;
		    }
		    else{
		        rem=num%10;
		        sumodd=sumodd+rem;
		    }
		    num=num/10;
		    n++;
		}
		System.out.println(sumodd);
		System.out.println(sumeven);


	}

}
