package practice_all_programe;

public class palindrome {
	public static void main(String[] args) {
	int no=151;
	int p=0;
	int d=0;
	while(no>0)
	{
		p=no%10;
		d=d*10+p;
				
		System.out.print(p);
		no=no/10;

	
	}
	if(p==no)
	{
		System.out.println("no is palindrome");
		
	}
	else
	{
		System.out.println("no is not palindrome");
	}
	}
}
