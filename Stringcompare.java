package demo;

public class Stringcompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "sachin";
		String s1 = "SACHIN";
		String s2 = "SACHIN";
		String s3 = "SACHINE";
		String s4 = "SACHin";
		String s5 = "malala";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s4));
		System.out.println();
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareToIgnoreCase(s4));
		
		//
		System.out.println();
		System.out.println(s.toUpperCase());
		System.out.println(s); // as strings are immutable s remains same. 
		System.out.println(s1.toLowerCase());
		System.out.println(s.indexOf("c"));
		System.out.println(s5.lastIndexOf('a'));
		System.out.println(s.startsWith("sac"));
		System.out.println(s.endsWith("in"));
		System.out.println(s.contains("chi"));
		System.out.println(s.substring(2)); // substring starting from index [2]
		System.out.println(s.substring(2,4)); // substring starting from index [2] and excludes index [4]
		
	}

}
