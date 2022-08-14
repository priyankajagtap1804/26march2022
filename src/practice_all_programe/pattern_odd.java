package practice_all_programe;

public class pattern_odd {
	public static void main(String[] args) {
		int str=1;
		
		for(int i=1;i<=5;i++)
		{
			int k=i;
			for(int j=1;j<=str;j++)
			{
				if(i%2==0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(k++);
				}
			
		}
		System.out.println();
		str++;
	}}

}
