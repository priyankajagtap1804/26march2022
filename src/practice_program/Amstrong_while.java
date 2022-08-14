package practice_program;

public class Amstrong_while {
	public static void main(String[] args) {
		
	int i=153;
	int no=i;
	int sum=0;
	int rem=0;
	while(i>0)
		
	{
		rem=i%10;
		sum=sum+rem*rem*rem;
		i=i/10;
		
	}
	System.out.println(sum);
	if(no==sum)
	{
		System.out.println("no is amstrong");
	}
	else
	{
		System.out.println("no is not amstrong");
	}
	}

}
