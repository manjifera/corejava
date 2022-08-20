package demo;

public class Stringbuffer {
	public static void main(String[] args) {
		//StringBuffer stb = new StringBuffer();
		StringBuilder stb = new StringBuilder();
		
		System.out.println(stb.capacity());  // string buffer store 16 item in its array.[][][][][][][][] like wise.
		//to add charaters in string buffeer we have append method. 
		stb.append("java");
		System.out.println(stb.length()); //java store in 4 places.
		System.out.println(stb); // java
		stb.append(" javascript");
		System.out.println(stb.length()); //java store in 4 places. //15
		System.out.println(stb); //java javascript
		stb.append(" james gosling"); // additional append expands stringbuffer new size = 16*2+2
		System.out.println(stb.capacity());
		stb.append(" james gosling"); 
		stb.append(" james gosling");
		System.out.println(stb.length()); //size
		System.out.println(stb.capacity());//capacity - wastage of memory.
		//lets trimout non used capacity.
		stb.trimToSize();
		System.out.println(stb.capacity()); //trimmed capacity to length of stringbuffer.
		System.out.println(stb);
		stb.delete(1, 10);
		System.out.println(stb);
		//Diff between StringBuffer and StringBuilder
		//initial capacity 16 | 16
		//mutable | mutable
		//new_size = currunt_size*2+2 
		//Thread Safe | Not thread safe. multithreading.
 	}
	
}
