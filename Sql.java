import java.util.Scanner;

public class Sql {
	
		String s = new String();
		String table = new String();
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
		//this add String in short aS" with two string args should be called to avoid last comma. in values. call it end before printSql()
		void  aS(String t, String nc) {
			System.out.print(t);
			String ss = scan.nextLine();
			System.out.println();
			this.s = this.s+"'"+ss+"' ";
		}
		
		//this add Number with two string args should be called to avoid last comma. in values. call it end before printSql()
		void  aN(String t, String nc) {
			
			System.out.print(t);
			String ss = scan.nextLine();
			System.out.println();
			this.s = this.s+ss+" ";
			//System.out.println(s);
		}
		
		void  aTable(String t) {
			//add table name. it will ask only once.
			System.out.print(t);
			this.table = scan.nextLine();
			System.out.println();
			this.s = "insert into "+this.table+" values (";
		}
		void printSql() {
			//call this at end only.
			this.s = s+ ");";
			System.out.print(s);
			this.s = "insert into "+this.table+" values (";
			System.out.println();
			System.out.println();
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sql obj = new Sql();
		obj.aTable("Table Name:");
		while(true) {
		obj.aN("Emp ID:");
		obj.aS("First name:");
		obj.aS("Last name:");
		obj.aN("Mobile:");
		obj.aS("Designation:");
		obj.aN("Salary:");
		obj.aS("Hire Date:","end"); //call if last data to enter in table is of type String with no leading comma.
		// obj.aN("Hire Date:","end"); //call if last data to enter in table is of type int with no leading comma.
		obj.printSql();
		}
		
	}

}