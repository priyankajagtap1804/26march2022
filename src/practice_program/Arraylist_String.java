package practice_program;

import java.util.ArrayList;

public class Arraylist_String {
	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList();
		list.add("priya");
		list.set(0,"radha");
		boolean ai = list.isEmpty();
		System.out.println(list);
		System.out.println(ai);
	}

}
