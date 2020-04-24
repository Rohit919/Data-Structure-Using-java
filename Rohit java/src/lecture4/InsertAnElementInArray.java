package lecture4;

import java.util.Scanner;

public class InsertAnElementInArray {

	public static void main(String[] args) {
		int[] arr1, arr2;
		arr1=takeInput();
		arr2=insertelement(arr1);
		display(arr2);
		
	}
	public static int[] takeInput() {
		System.out.println("Enter the size of the array");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the element of an array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	public static int[] insertelement(int[] arr ){
		int[]arr2 = new int[arr.length+1];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the element you want to insert");
		int element = s.nextInt();
		System.out.println("Enter the index number");
		int index = s.nextInt();
	    for(int i = 0; i < index; i++) { 
	         arr2[i] = arr[i];
	      }
	    arr2[index]=element;
	      for(int j = index; j < arr2.length-1;j++) { 
	         arr2[j+1] = arr[j];
	      } 
		return arr2;
	}
	public static void display(int[] arr) {
		System.out.println("New  array is");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
