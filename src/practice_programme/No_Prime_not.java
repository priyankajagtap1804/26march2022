package practice_programme;

public class No_Prime_not {
	public static void main(String[] args) {
		int no=17;
		int no1;
		int count=0;
		for(int i=2;i<=no;i++)
		{
			if(no%2==0)
			{
				count++;
			}
		}
			if(count>0)
			{
				System.out.println("no is not prime");
			}
			else
			{
				System.out.println("no is prime");
			}
			
		
	}

}
