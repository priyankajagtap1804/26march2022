package practice_programme;

public class Amstrong_No {
	public static void main(String[] args) {
		int AmNo=153;
		int rem;
		int sum=0;
		for(int i=AmNo;i>0;i=i/10)
		{
			rem=i%10;
			sum=sum+rem*rem*rem;
			
			
		}
		System.out.println(sum);
		
		if(AmNo==sum)
		{
			System.out.println("No is Amstrong");
		}
		else
		{
			System.out.println("No is not Amstrong");
		}
	}
	
	
	

}
