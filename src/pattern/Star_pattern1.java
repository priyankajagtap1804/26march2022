package pattern;

public class Star_pattern1 {
	public static void main(String[] args) {
		int str=1;
		int str1=3;
		int str2=1;
		int str3=3;
		for(int i=1;i<=4;i++)
		{
			for(int c=str1;c>=1;c--)
			{
			System.out.print(" ");	
			}
			for(int j=1;j<=str;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
			str++;
			str1--;
		}
for(int i=1;i<=3;i++)
{

		for(int c=1;c<=str2;c++)
		{
		System.out.print(" ");	
		}
		for(int j=1;j<=str3;j++)
		{
			System.out.print("*");
		}
		System.out.println("");
		str2++;
		str3--;
			
	}
	}
}
