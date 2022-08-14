package pattern;

public class method2 extends method{
	int a=30;
	 static String ceo="pradeep";
     String empname;
	 int empsal;
	 method2(String empname,int empsal)
	{
		this.empname=empname;
		this.empsal=empsal;
	
	}
	public void empinfo()
	{
		System.out.println(empname+"  "+empsal+" "+ceo);
		System.out.println(this.a);
		
	}
	public void sum()
	{
		System.out.println(a);
	}
	
		
}
