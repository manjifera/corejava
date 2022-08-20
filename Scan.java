package demo;
import java.util.*;

public class Scan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int age[] = new int[5];
		for(int i=0;i<5;i++) {
			System.out.print("Enter age of student no "+(i+1)+":");
			age[i] = scan.nextInt();
			System.out.println();
		}
		
		for(int i=0;i<5;i++) {
			System.out.println("Enter age of student no "+(i+1)+" is "+age[i]);
		}
	}

}
