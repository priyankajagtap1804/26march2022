package practice_program;

import java.util.Scanner;

public class palindrome {
	
public static void main(String[] args) {
	Scanner sc1=new Scanner(System.in);
	int no=sc1.nextInt();
	int sum=0;
	int rem;
	int f=no;
	while(no>=1)
	{
		rem=no%10;
		sum=sum*10+rem;
		no=no/10;
	System.out.println(sum);
	}
	if(f==sum)
	{
		System.out.println("no is palindrome");
	}else
	{
		System.out.println("no is not palindrome");
	}
}
	
}
