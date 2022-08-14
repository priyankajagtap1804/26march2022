package practice_program;

public class Array_largest_no {
	public static void main(String[] args) {
		int temp=0;
		int count=0;
		int ar[]= {25,20,40,5,4,5};
		System.out.println(ar.length);
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<=ar.length-1;j++)
			{
				if(ar[i]<ar[j])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			
			}
			if(i==1) {
			System.out.println(ar[i]);
			}
		}
	}
}
