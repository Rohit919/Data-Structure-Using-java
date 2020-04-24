package lecture3;

import java.util.Scanner;

public class Quadatricequation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double a=s.nextInt();
		double b=s.nextInt();
		double c=s.nextInt();
		double D=((b*b)-4*a*c);
		if(D>0){
		    int x1=(int) ((-b-Math.sqrt(D))/2*a);
		    int x2=(int) ((-b+Math.sqrt(D))/2*a);
		    System.out.println("Real and Distinct");
		    System.out.print(x1+" "+x2);
		}
		else if(D==0){
		    int x1=(int) ((-b-Math.sqrt(D))/2*a);
		    int x2=(int) ((-b+Math.sqrt(D))/2*a);
		    System.out.println("Real and Equal");
		    System.out.print(x1+" "+x2);  
		}
		else{
		   System.out.println("Imaginaryl");
		}

	}

}
