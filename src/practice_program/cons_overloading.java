package practice_program;

public class cons_overloading {
	int num1;
	int num2;
	String name;
	
	cons_overloading(int a,int b)
	{
		num1=a;
		num2=b;
		
	}
	cons_overloading(String d,int c)
	{
		name=d;
	    num1=c;
		
	}
	public void display()
	{
		System.out.println(num1+num2);
		
	}
      public void put()
	{		
		System.out.println(name+num1);
	
	}	
	public static void main(String[] args) {
		cons_overloading sc1=new cons_overloading(20,30);
			
		cons_overloading sc2=new cons_overloading("prianka",100);
		sc1.display();
		sc2.put();
	}

}
