package demo;

public class Strongpass {

	
	static int strongPassword(int n, String s) {
		//6 char long one didit, one lc, 1uc, 1sc from !@#$%^&*()-+
		//PassW@rd1
		int count = 0;
		int cap=0;
		int sma =0;
		int num=0;
		int spc=0;
		for(int i=0;i<=n-1;i++) {
			char c = s.charAt(i);
			if(c>='A' && c<='Z') {
			cap++;
			}
			if(c>='a' &&  c<='z') {
			sma++;	
			}
			if(c>='0' && c<='9') {
			num++;	
			}
			if(c=='!' || c=='@' || c=='#' || c=='%' || c=='^' || c=='&' || c=='*' || c=='(' || c==')' || c=='-' || c=='+') {
				spc++;
			}

		}	
		
		System.out.println(cap);
		System.out.println(sma);
		System.out.println(num);
		System.out.println(spc);
		
		
		if(cap<=0) {
			count++;
		}
		if(sma<=0) {
			count++;
		}
		if(num<=0) {
			count++; 
		}
		if(spc<=0) {
			count++;
		}
		System.out.println(count);
		int ae=0;
		if(s.length()+count<=6) {
			ae = 6- (s.length() + count);
		}
		return count+ae;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(strongPassword(100,"AYC3616843O52RP28ZMV7K4V08J8MGBT8C0192TZIAX5160282H58JNWC96WV3GBC1S14W93J2K07V71LG8LT9N1P2H81T33OYF8"));
		//System.out.println(strongPassword(4,"4700"));
	}

}
