package practice_program;
import java.util.*;
public class for_loop {
	public static void main(String[] args) {
		Scanner sc1= new Scanner(System.in);
		int  marks=sc1.nextInt();
		if(marks>=35)
		{
			System.out.println("he is pass");
		}
			else if(marks>=60)
			{
				System.out.println("he got first class");
			}
				else if(marks>=75)
				{
					System.out.println("he got distigtion ");
				}
		
		
		else
		{
			System.out.println("he is fail");
		}
	}
}

