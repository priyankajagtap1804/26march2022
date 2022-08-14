package class_star_pattern;

public class star_pattern_5 {
	public static void main(String[] args) {
//		*
//		**
//		***
//		****
//      ***
//      **
//      *
		int start=1;
		int spaces=0;
		int start1=3;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=start;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			start++;;
			
		}
				for(int i=1;i<=3;i++)
		{
		
		for(int j=1;j<=start1;j++)
		{
			System.out.print("*");
		}
		System.out.println();
		start1--;
		}
	
	}
}
