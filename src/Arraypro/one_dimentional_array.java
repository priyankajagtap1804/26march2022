package Arraypro;

import java.util.Arrays;

public class one_dimentional_array {
	public static void main(String[] args) {
		int[] ar= {10,40,30,50,60};
		System.out.println(ar.length);
		System.out.println(ar[4]);
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		Arrays.sort(ar);
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		System.out.println("----------");
		for(int j=ar.length-1;j>=0;j--)
		{
			System.out.println(ar[j]);
		}
			
	}
	
}	
