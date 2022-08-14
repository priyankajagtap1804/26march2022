package pattern;
import java.util.*;
public class star_pattern {
	public static void main(String[] args) {
		Scanner m1=new Scanner(System.in);
		int n=m1.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
				System.out.print(j);
		}
		System.out.println("  ");
	}

}
