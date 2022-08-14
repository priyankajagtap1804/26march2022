
public class Swap_programme {
public static void main(String[] args) {
	int no=153;
	int sum=0;
	int c;
	int d;
	for(int i=0;i<=no;i++)
	{ 
		 c=no%10;
	 d=c*c*c;
	sum=d+sum;
	System.out.println(sum);

	no=no/10;
		System.out.println("no is amstrong");
	}
	
	
	}

}