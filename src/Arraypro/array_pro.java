package Arraypro;

import java.util.Arrays;

public class array_pro {
	public static void main(String[] args) {
		int[] a= {105,67,89,40,50};
		Arrays.sort(a);
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		for(int j=a.length-1;j>=0;j--)
		{
			System.out.println(a[j]);
		}
		
	}

}
