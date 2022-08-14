package practice_program;

import java.util.Scanner;

public class febonanssi {
	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		int no=sc1.nextInt();
		int a=0;
		int b=1;
		int temp;
		
		for(int i=1;i<=no;i++)
		{
			System.out.println(a);
			temp=a+b;
			a=b;
			b=temp;
		}
		
	}

}
