package pattern;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashMap1{
	public static void main(String[] args) {
		HashMap<Integer,String>ar= new HashMap<Integer,String>();
		ar.put(1,"priya");
		ar.put(2, "priya");
		ar.put(13, "seema");
		ar.put(10,"sandhya");
		ar.put(11,"sandhya");
		System.out.println(ar);
		System.out.println(ar.get(11));
		Set<Integer> ar1 = ar.keySet();
		System.out.println(ar1);
		System.out.println(ar.containsKey(2));
		System.out.println(ar.containsValue("sandhya"));
		
	}
	

}
