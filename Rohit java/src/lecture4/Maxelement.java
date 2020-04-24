package lecture4;

import java.util.Scanner;

public class Maxelement {

	public static void main(String[] args) {
		System.out.println("Enter the length of array");
		Scanner s = new Scanner(System.in);
		int N=s.nextInt();
		int[] arr=new int[N];
		System.out.println("Enter the element of an array");
		for(int i=0;i<N;i++) {
			arr[i]= s.nextInt();
		}
		System.out.println("Maximum element is "+max(arr));
	}
	public static int max(int[] arr) {
		int temp=Integer.MIN_VALUE;
		for(int i=0;i<=4;i++) {
			if(temp<arr[i]){
				temp=arr[i];
			}
		}
		return temp;
	}

}
