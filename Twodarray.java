package demo;
import java.util.*;

public class Twodarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Scan age of 2 school chodren having two standard of 5 students each.");
		Scanner scan = new Scanner(System.in);
		// no of rows 2 // no of column 5 in each row.
		int age[][] = new int[2][5];
		for(int i=0;i<age.length;i++) {
				for(int j=0;j<age[i].length;j++) {
					System.out.println("Enter age of student "+(j+1)+" from school "+(i+1));
					age[i][j] = scan.nextInt();	
				}
			}
		
		//Get info
		for(int i=0;i<age.length;i++) {
			for(int j=0;j<age[i].length;j++) {
				System.out.println("Age of student "+(j+1)+" from school "+(i+1)+" is:"+age[i][j]);
			}
		}
	}

}
