package practice_all_programe;

public class prime {
	public static void main(String[] args) {
		int count=0;
		int no;
		for(  no=1;no<=100;no++)
		 {
			for(int j=2;j>=no-1;j++)
		{
			if( no%j==0)
			{
				count=count+1;
				
				}
			}
		 }
		if (count==0)
		{
			System.out.println(no);
		}
		else {
			count=0;
		}
		
	}
	
}
