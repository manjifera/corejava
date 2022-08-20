package demo;
import java.util.StringTokenizer;
public class Stringtokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "JAVA,PYTHON,SQL,AI";
	StringTokenizer st = new StringTokenizer(s,","); //bydefault tokenization happens at space or mention it its comman or whatever token ypu have comman.
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
			//quiz
			System.out.println("hi"+10+5);
			char chars[] = {'a','b','c'};
			String s2 = new String(chars);
			System.out.println(s2);
			String s3 = new String("Java");
			String s4 = new String("Javac");
			System.out.println(s3 = s4);
		}
	}

}
