package demo;

public class Substring {

	static String reverse(String s) {
		char[] c =  s.toCharArray();
		int i=0, j=c.length-1;
		while(i<=j) {
			char temp = c[i];
			c[i] = c[j];
			c[j] = temp;
			i++;
			j--;
		}
		return new String(c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcd";
		System.out.println(s);
		System.out.println(reverse(s));
	}

}
