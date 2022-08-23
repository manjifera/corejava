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
	
	static void longestsubstring(String s) {
		String temp ="";
		String res = "";
		int n =s.length();	
		for(int i=0;i<n;i++) {
				for(int j=i;j<n;j++) {
					
					if(temp.indexOf(s.charAt(j)) == -1) {
					temp = temp + s.charAt(j);
					}
					else {
						break;
					}
					if(temp.length()>res.length()) {
						res = temp;
					}
				}
			}
		System.out.println(res);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s = "abcd";
		//System.out.println(s);
		//System.out.println(reverse(s));
		longestsubstring("Tapacademy");
	}

}
