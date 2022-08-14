package practice_programme;

import java.util.HashMap;
import java.util.Set;

public class Hashmap {
	public static void main(String[] args) {
		HashMap<Integer,String>Mp=new HashMap<Integer,String>();
		Mp.put(101,"priya");
		Mp.put(102,"Ganesh");
		Mp.put(103,"Aravi");
		System.out.println(Mp);
		Set<Integer>al = Mp.keySet();
		for(Integer key:al)
		{
			System.out.println(key);
		}
		
		System.out.println(Mp.get(101));
		System.out.println(Mp.containsKey(102));
		System.out.println(Mp.containsKey(104));

	}

}
