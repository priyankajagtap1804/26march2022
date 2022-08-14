package practice_all_programe;

public class reverse_number {
	public static void main(String[] args) {
		int no=1221;
		int no1=0;
		int sum=0;
		int temp=no;
		while(no>0)
		{
			no1=no%10;
			sum=sum*10+no1;
		System.out.println(sum);
		no=no/10;
		}
		if(temp==sum)
		{
			System.out.println("no is palindrome");
			
		}
		else
		{
			System.out.println("no is not palindrome");
		}
		
	}

}
