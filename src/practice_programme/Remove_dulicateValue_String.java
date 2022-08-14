
package practice_programme;

import java.util.LinkedHashSet;

public class Remove_dulicateValue_String {
	public static void main(String[] args) {
		String str="ssshubbhham";
		LinkedHashSet a1=new LinkedHashSet();
		for(int i=0;i<=str.length()-1;i++)
		{
			char s2=str.charAt(i);
			a1.add(s2);
			
		}
		System.out.print(a1);
		
	}

}
