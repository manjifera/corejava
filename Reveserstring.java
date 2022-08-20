package demo;

public class Reveserstring {

	static String reverseString(String s) {
		String t="";
		for(int i=s.length()-1;i>=0;i--) {
			t = t + s.charAt(i);
		}
		return t;
	}
	
	static boolean isPalindrome(String s) {
		if(s.equals(reverseString(s))) {
			return true;
		}
		else {
			return false;
		}
	}
	
	static boolean isPalindrome2(String s) {
		int i=0, j=s.length()-1;
		while(i<=s.length()-1 && j>=0) {
			if(s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	
	static int vowels(String s) {
		int count=0;
		int i=0;
		// while( i<=s.length()-1) {
		for(i=0;i<=s.length()-1;i++) {
			char c = s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
				count++;
			}
		// i++;
		}
		return count;
		
	}
	
	static String removeVowels(String s) {
		String t="";
		int i=0;
		// while( i<=s.length()-1) {
		for(i=0;i<=s.length()-1;i++) {
			char c = s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {

			}
			else {
				t = t + s.charAt(i);
			}
		// i++;
		}
		return t;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(reverseString("PRASHANT"));
		//System.out.println(isPalindrome2("abfja"));
		// System.out.println(vowels("Patil"));
		System.out.println(removeVowels("TapAcademy"));
	}

} 
