package practice_all_programe;

public class palindromen_no {
	public static void main(String[] args) {
		int a=5225;
		 int c=0;
		int sum=0;
		int temp=a;
		while(a>0)
		{
		 c=a%10;
		sum=sum*10+c; 
		System.out.println(sum);
		
		a=a/10;
		}
		if(temp==sum)
		{
			System.out.println("no is  palindrome");
		}
		else
		{
			System.out.println("no is not  palindrome");
		}
		
	}

}
