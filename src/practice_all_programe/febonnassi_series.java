package practice_all_programe;
import java.util.*;

public class febonnassi_series {
	static Scanner sc1= new Scanner(System.in);
	static int a= sc1.nextInt();
	public static void main(String[] args) {
		
		febo();
	
}
public static void febo()
{ 
	
	int i=1;
	int j=0;
	int m=0;
	for(int f=1;f<=a;f++)
	{
		
	m=j+i;
	System.out.println(m);
	j=i;
	i=m;
		}
	}
	
}
