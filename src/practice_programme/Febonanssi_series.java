package practice_programme;

public class Febonanssi_series {
	public static void main(String[] args) {
		
	
	int i=1;
	int no=15;
	int a=0;
	int b=1;
	int c=0;
	while(i<=no)
	{
		System.out.println(a);
		c=a+b;
		a=b;
		b=c;
		i++;
	}
	
		
	}

}
