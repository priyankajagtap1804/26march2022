package practice_program;

import java.util.Scanner;

public class Factorials {
	public static void main(String[] args) {
		Scanner sr= new Scanner(System.in);
		int a=sr.nextInt();
		int j=1;
		for(int i=1;i<=a;i++)
		{
			j=j*i;
					}
		System.out.print(j);
	}

}
