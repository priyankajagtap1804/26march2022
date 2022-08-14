package practice_program;

public class Amstrong_no {
	public static void main(String[] args) {
	int AmstrongNo=153;
	int sum=0;
	int rem=0;
	
	for(int i=AmstrongNo;i>0;i=i/10)
	{
		rem=i%10;
		sum=sum+(rem*rem*rem);
		
	}
	System.out.println(sum);
	if(AmstrongNo==sum)
	{
		System.out.println("no is amstrong");
	}
	else
	{
		System.out.println("no is not amstrong");
	}
}
}
