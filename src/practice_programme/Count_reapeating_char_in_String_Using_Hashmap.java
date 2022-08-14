package practice_programme;

import java.util.HashMap;

public class Count_reapeating_char_in_String_Using_Hashmap {
	public static void main(String[] args) {
		String org="abcabk";
		HashMap<Character,Integer>mp=new HashMap<Character,Integer>();
		for(int i=0;i<=org.length()-1;i++)
		{
			char org1 = org.charAt(i);
			if(mp.containsKey(org1))
			{
				mp.put(org1,mp.get(org1)+1);
			}
			else
			{
				mp.put(org1,1);
			}
		}
		java.util.Set<Character>allkeys=mp.keySet();
		for(Character Key:allkeys)
		{
			System.out.println(Key+":"+mp.get(Key));
		}
		
	}

}
