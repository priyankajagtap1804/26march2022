package practice_all_programe;

public class Array_sort {
	public static void main(String[] args) {
		int[]ar= {10,20,5,7,25};
		int temp=0;
		for(int i=0;i<=ar.length-1;i++)
		{
			for(int j=i+1;j<=ar.length-1;j++)
			{
				if(ar[i]>ar[j])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
					
					}
				
			}
		System.out.println(ar[i]);
			}
				
			
		}
	}


