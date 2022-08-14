package practice_all_programe;

import java.util.Scanner;

public class amstrong_no {
	
	public static void main(String[] args) {
		
	long a=153;
	long b=a;
		long sum=0;
		long c;
		long cube;
		while(b>0)
		{
			c=b%10;
			cube=c*c*c;// only for 3 digit no
			System.out.println(cube);
			sum=cube+sum;
			System.out.println(sum);
			b=b/10;
		}
		if(a==sum)
		{
			System.out.println("no is amstrong");
		}
		else
		{
			System.out.println("no is not amstrong");
		}
	}

}
