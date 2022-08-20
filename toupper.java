package demo;
import java.util.Scanner;
public class toupper {
	
	static String toUpperCase(String s) {
		String t = "";
		
		for(int i=0;i<s.length();i++){
		t =	t + (char)(s.charAt(i)-32);
		}
		return t;
	}
	//method overloading done in below mothod.
	static int indexOf(String s, String c) {
		char key = c.charAt(0); // store char to search in string and return its index.
		for(int i=0; i<s.length();i++) {
			if(s.charAt(i)==key) {
				return i;
			}
		}
		return -1;
	}
	//method overloading example. 
	static int indexOf(String s, String c,int ocn) {
		char key = c.charAt(0); // store char to search in string and return its index.
		int count = 0;
		for(int i=0; i<s.length();i++) {
			if(s.charAt(i)==key) {
			count++;
				if(count==ocn)
				return i;
			}
		}
		return -1;
	}
	
	static int lastIndexOf(String s, String c) {
		char key = c.charAt(0); // store char to search in string and return its index.
		int count = 0;
		for(int i=s.length()-1; i>=0;i--) {
			if(s.charAt(i)==key) {
				return i;
			}
		}
		return -1;
	}
	
	static String trim(String s) {
		int si=0, li=0;
		String t="";
		// System.out.println(s+":");
		for(int i=0;i<=s.length();i++) {
			if(s.charAt(i)!=' ') {
				si = i;
				break;
			}
		}
		for(int i=s.length()-1;i>=0;i--) {
			if(s.charAt(i)!=' ') {
				li = i;
				break;
			}
		}
		for(int i=si;i<=li;i++) {
			t = t + s.charAt(i);
		}
		return t;
	}
	
		static String substring(String s, int a) {
			String t="";	
			for(int i=a;i<=s.length()-1;i++) {
					t = t+s.charAt(i);
				}
			return t;
		}
		
		static String substring(String s, int a, int b) {
			String t="";	
			for(int i=a;i<=b-1;i++) {
					t = t+s.charAt(i);
				}
			return t;
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner scan = new Scanner(System.in);
		//String s = scan.nextLine();
		//System.out.println(toUpperCase(s));
		//System.out.println("Enter char index to find:");
		//String c = scan.nextLine();
		//System.out.println(indexOf(s,c));
		//System.out.println("Enter occurancxe no :");
		//int ocn = scan.nextInt();
		//System.out.println(indexOf(s,c,ocn));
		//System.out.println(lastIndexOf("Suraj","a"));
		System.out.println(substring("java is good",2,4));
		
		
	}

}
