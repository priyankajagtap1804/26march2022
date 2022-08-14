package practice_all_programe;
import java.util.*;
public class factirial {
	Scanner sc1= new Scanner(System.in);
	int a=sc1.nextInt();
public static void main(String[] args) {
	factirial sc2=new factirial();
	sc2.m1();
	
}	
public void m1()
{
	if(a<=0)
	{
		System.out.println("no is not valid");
	}
	int b=1;
	int c=0;
	for(int i=a;i>=1;i--)
	{
		
		b=i*b;
		
	
	}
	System.out.println(b);
}
}

