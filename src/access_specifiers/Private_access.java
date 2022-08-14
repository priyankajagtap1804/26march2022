package access_specifiers;

public class Private_access {
	protected int a=10;
	public static void main(String[] args) {
		Private_access sc1=new Private_access();
		 System.out.println(sc1.a);
		 sc1.m1();
	}


protected void m1()
{
	 int b=10;
	 int c=50;
	 System.out.println(b+c);

}
}