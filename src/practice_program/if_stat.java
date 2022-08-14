package practice_program;
import java.util.*;
public class if_stat {
	public static void main(String[] args) {
		 Scanner sc1=new Scanner(System.in);
		 int age=sc1.nextInt();
		 int weight=sc1.nextInt();
		if(age>=18)
		{
			
			System.out.println("he is adult");
			
			 if(weight>=67)
			{
			  System.out.println("he is eligible for donate blood");
				   
		    }
		      else {
			         System.out.println("he is not eligible for donate blood");
		          }
		}
		
		else
		{
			System.out.println("he is not adult");
		}
	}
}
