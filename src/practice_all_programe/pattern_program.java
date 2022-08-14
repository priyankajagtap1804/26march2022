package practice_all_programe;

public class pattern_program {
	public static void main(String[] args) {
		int n=5;
		int b=6;
		for(int i=1;i<=n;i++)
		{//spaces
			for(int j=1;j<=n-i;j++)
			{
				
				System.out.print(" ");
				
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}
