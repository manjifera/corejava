package demo;

import java.util.Scanner;


public class Array7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of values:");
		int n=sc.nextInt();
		System.out.println("Enter values:");
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(i%2!=0) {
				sum=sum+arr[i];
			}
		}
		System.out.println(sum);
	}

}
