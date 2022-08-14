package practice_all_programe;

public class febo_series {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int temp=0;
		int c;
		for(int i=0;i<=10;i++)
		{
			System.out.println(a);
			temp=a+b;
			a=b;
			b=temp;
			
		}
	}

}
