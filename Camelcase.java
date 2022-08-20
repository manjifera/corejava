package demo;

public class Camelcase {
	
	static int camelCase(String s) {
		int wc = 1;
		for(int i=0;i<s.length();i++) {
			//as A = 65 and Z = 90 we can use any A or 65 like wise
			if((s.charAt(i) >= 65) && (s.charAt(i) <= 90)) {
				wc++;
			}
		}
		return wc;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(camelCase("myNameIsSharukh"));
	}

}
