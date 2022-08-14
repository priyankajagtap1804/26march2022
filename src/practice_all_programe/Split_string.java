package practice_all_programe;

import java.util.Arrays;

public class Split_string {
	public static void main(String[] args) {
		String s1="priyanak";
		String s3="radha";
		String[]s2=s1.split("");
		System.out.println(s1.length());
		System.out.println(s1.startsWith("pri"));
		System.out.println(s1.compareTo("radha"));
		System.out.println(s1.substring(3,6));
		Arrays.sort(s2);
		for(int i=0;i<=s2.length-1;i++)
		{
			System.out.println(s2[i]);
			
		}
		System.out.print(s2.length);
	}
	

}