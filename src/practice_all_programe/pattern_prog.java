package practice_all_programe;

public class pattern_prog {
	public static void main(String[] args) {
	int no=6;
	for(int i=1;i<=no;i++)
	{
		for(int j=1;j<=no-i;j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print("*"+" ");
		}
		System.out.println();
}
 
 }

}