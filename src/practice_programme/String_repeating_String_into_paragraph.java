package practice_programme;

import java.util.HashMap;
import java.util.Set;

public class String_repeating_String_into_paragraph {
	public static void main(String[] args) {
		
	String str="priya madhu priya ganesh radha priya";
	String str1[]=str.split(" ");
	HashMap<String,Integer>Mp=new HashMap<String,Integer>();
	for(int i=0;i<=str1.length-1;i++)
	{
		String str2 = str1[i];
		if(Mp.containsKey(str2))
		{
			Mp.put(str2, Mp.get(str2)+1);
		}else
		{
			Mp.put(str2,1);
		}
	}
			Set<String> alkays = Mp.keySet();
			for(String key:alkays)
			{
				if(Mp.get(key)>1)
				{
					System.out.println(key+":"+Mp.get(key));
				}
			}
	}

}
