// package demo;
import java.util.Scanner;

public class Sqlstring {
	
		String s = new String();
		Scanner scan = new Scanner(System.in);
		
		void  aN(String t) {
			System.out.print(t);
			String ss = scan.nextLine();
			System.out.println();
			this.s = this.s+ss+", ";
			//System.out.println(s);
		}
		
		void  aS(String t) {
			System.out.print(t);
			String ss = scan.nextLine();
			System.out.println();
			this.s = this.s+"'"+ss+"', ";
		}
		//pass 2nd string args to avoid last comma. 
		void  aS(String t, String nc) {
			System.out.print(t);
			String ss = scan.nextLine();
			System.out.println();
			this.s = this.s+"'"+ss+"' ";
		}
		
		void  aN(String t, String nc) {
			System.out.print(t);
			String ss = scan.nextLine();
			System.out.println();
			this.s = this.s+ss+" ";
			//System.out.println(s);
		}
		
		void  aTable(String t) {
			System.out.print(t);
			String ss = scan.nextLine();
			System.out.println();
			this.s = "insert into "+ss+" values (";
		}
		void printSql() {
			this.s = s+ ");";
			System.out.print(s);
			System.out.println();
			System.out.println();
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sqlstring obj = new Sqlstring();
		obj.aTable("Table Name:");
		while(true) {
		obj.aN("Emp ID:");
		obj.aS("First name:");
		obj.aS("Last name:");
		obj.aN("Mobile:");
		obj.aS("Designation:");
		obj.aN("Salary:");
		obj.aS("Hire Date:","end");
		obj.printSql();
		}
		//System.out.println(obj.s);
	}

}
