package practice_program;

public class No_palindrome {
	public static void main(String[] args) {
		int no=212;
		int temp=no;
		int rem;
		int sum=0;
		
		for(int i=no;i>0;i=i/10)
		{
			rem=no%10;
			sum=sum*10+rem;
			
		//	System.out.println(sum);
		}
		System.out.println(sum);
		
		if(no==sum)
		{
			System.out.println("no is palindrome");
		}
		else
		{
			System.out.println("no is not palindrome");
		}
	}

}
