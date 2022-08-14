package practice_program;

public class WhileLoop_fact {
	public static void main(String[] args) {
		
		int fact=1;
		int i=1;
		while(i<=5)
		{
			fact=fact*i;
			i++;
		}
		
		System.out.println("factrial"+"      "+fact);
		
	}

}
