package Arraypro;

import java.util.Arrays;

public class String_array {
	public static void main(String[] args) {
		String[] ar=new String[5];
		ar[0]="deepa";
		ar[1]="priya";
		ar[2]="zoya";
		ar[3]="swapna";
		ar[4]="sarika";
		System.out.println(ar[1]);
		System.out.println(ar.length);
		Arrays.sort(ar);
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		for(int j=ar.length-1;j>=0;j--)
		{
			System.out.println(ar[j]);
		}
	}

}
