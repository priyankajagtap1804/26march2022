package practice_programme;

import java.util.HashMap;
import java.util.Set;

public class PrintDublicate_charactor_string_usingHashmap {
	public static void main(String[] args) {
		String str="adfsaahyyydd";
		HashMap<Character,Integer>mp=new HashMap<Character,Integer>();
		for(int i=0;i<=str.length()-1;i++)
		{
			char org = str.charAt(i);
		
		if(mp.containsKey(org))
		{
			mp.put(org,mp.get(org)+1);
		}
		else
		{
			mp.put(org,1);
		}
		
	}
		System.out.println(mp);
		Set<Character>allkeys=mp.keySet();
		for(Character key:allkeys)
		{
			if(mp.get(key)>1)
			{
				System.out.println(key+" "+mp.get(key));
			}
		}
	}
}
