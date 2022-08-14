package pattern;

public class constructor1 {
	int i;
	int j;
	String a;
	String b;
	
	constructor1(int i,String b)
	{
		this.i=i;
		this.b=b;
	}
	constructor1(int a)
	{
		i=a;
	}
	constructor1(String a,String b)
	{
		this.a=a;
		this.b=b;
		System.out.println(a+"  "+b);
	}
	public void m5()
	{
		System.out.println(a+"  "+b);
	}
	public void m4()
	{
		System.out.println(i);
	}
	public void add()
	{
		System.out.println(i+j);
		System.out.println(i);
	}
	public void mul()
	{
		System.out.println(i+" "+b);
	}
	public static void main(String[] args) {
		constructor1 m1=new constructor1(2,"shivani");
		m1.mul();
		m1.add();
		constructor1 m3=new constructor1(100);
		m3.m4();
		constructor1 str=new constructor1("radha","maya");
		str.m5();	
		System.out.println("------------------------");
		
	}

}
