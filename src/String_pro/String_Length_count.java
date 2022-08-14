package String_pro;

import java.util.Scanner;

public class String_Length_count {
	public static void main(String[] args)
	{
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char str1=' ';
	int count=0;
	
	for(int i=0;i<=str.length()-1;i++)
	{
		
	   str1 =str.charAt(i);
	   if(str1==' ')
	   {
		   count++;
	   }
	  
	}	
	System.out.println("Space of String"+count);
	System.out.println(str.replace(" ",""));
		System.out.println(str.length());
	 
	
	}
}
