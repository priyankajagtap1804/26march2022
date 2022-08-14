package Arraypro;

public class two_dimentional_array {
	public static void main(String[] args) {
		int [][] ar= {{20,30,40},{45,40,90}};
		System.out.println(ar.length);
		System.out.println(ar[1][1]);
	    for(int i=0;i<=ar.length-1;i++)
	    {
	    	for(int j=0;j<=ar.length;j++)
	    	{
	    		System.out.print(" "+ar[i][j]);
	        }
	    	System.out.println();
	    }
	
	}

}