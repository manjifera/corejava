package demo;

public class Stringcountvowels {

	static int countWords(String s) {
		int count = 0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) == ' '){
				count++;
			}
		}
		return count;
	}

	static int countSpaces(String s) {
		int count = 1;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) == ' '){
				count++;
			}
		}
		return count;
	}
	
	static int countCharCount(String s, String gc) {
		int count = 0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) == gc.charAt(0)){
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(countSpaces("This is test case one"));
		//System.out.println(countWords("This is test case one"));
		System.out.println(countCharCount("This is test case one","w"));
	}

}
