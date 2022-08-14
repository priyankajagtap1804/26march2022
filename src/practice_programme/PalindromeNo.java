package practice_programme;

public class PalindromeNo {
public static void main(String[] args) {
	int no=121;
	int temp=no;
	int rem;
	int sum=0;
	for(int i=temp;i>0;i=i/10)
	{
		rem=i%10;
		sum=sum*10+rem;
		
		
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
