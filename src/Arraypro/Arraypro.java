package Arraypro;

import java.util.Arrays;

public class Arraypro {
	public static void main(String[] args) {
		int[] ar=new int[5];
		ar[0]=20;
		ar[1]=30;
		ar[2]=70;
		ar[3]=50;
		
		System.out.println(ar[1]);
		for(int i=0;i<=3;i++)
		{
			System.out.println(ar[i]);
			
		}
		System.out.println("----------------");
		Arrays.sort(ar);
		for(int j=0;j<=ar.length-1;j++)
		{
			System.out.println(ar[j]);
		}
		System.out.println("-----------------");
		for(int j=ar.length-1;j>=0;j--)
		{
			System.out.println(ar[j]);
		}
		
	}

}
