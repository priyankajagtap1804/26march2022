package Arraypro;

import java.util.Arrays;

public class Array_Slit {
	public static void main(String[] args) {
	String a="madam";
		
		String rev="";
		
		
		for(int i=a.length()-1;i>=0;i--)
		{
			rev=rev+a.charAt(i);
		}
		System.out.println(rev);
		if(a.equals(rev))
		{
		System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("string is not palindrome");
		}
	}

}
