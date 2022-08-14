package practice_all_programe;

import java.util.Scanner;

public class String_reverse {
	public static void main(String[] args) {
		String rev="";
//		String num="priya jagtap";
		Scanner v1=new Scanner(System.in);
		System.out.println("enter the String");
		String num =v1.next();
		for(int i=num.length()-1;i>=0;i--)
		{
			System.out.print(num.charAt(i));
		}
		System.out.print(rev);
	}

}
