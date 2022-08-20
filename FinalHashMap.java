package demo;

import java.util.*;

public class FinalHashMap {

	private static final Map map = new HashMap();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		map.put(1,"Prashant");
		map.put(2,"Prashant");
		System.out.println(map.values());
		System.out.println(map.hashCode());
		Map map = new HashMap();
		map.put(3, "Raj");
		System.out.println(map.values());
		System.out.println(map.hashCode());
	}

}
