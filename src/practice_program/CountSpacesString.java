package practice_program;

import java.util.Scanner;

public class CountSpacesString 
	{
	public static void main(String[] args)
	{
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
	int count=0;
	
	for(int i=0;i<=str.length()-1;i++)
	{
		char str1=str.charAt(i);
		if(str1==' ')
		{
			count++;
		}
		
	}
	System.out.println(count);
	
	}
	}



