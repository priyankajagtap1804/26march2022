package pattern;

public class Star_pattern2 {
	public static void main(String[] args) {
		int str=4;
		int str2=3;
		int str3=1;
		for(int i=1;i<=str;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("\n");
		}
		for(int i=1;i<=str2;i++)
		{
		for(int j=str2;j>=i;j--)
		{
			System.out.print("*");
		}
		System.out.println("\n");
		str3++;
		}
	}
}
