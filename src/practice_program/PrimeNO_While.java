package practice_program;

public class PrimeNO_While {
	public static void main(String[] args) {
		int no=20;
		int i=2;
		int count=0;
		while(no>i)
		{
				if(no%i==0)
				{
					count=count+1;
					
					//System.out.println(count);
				}
				i++;
		}
				if (count==0)
				{
					System.out.println("no is prime");
					
				}
				else
				{
		System.out.println("no is not prime");
		
			
			}
	}
		
	}
