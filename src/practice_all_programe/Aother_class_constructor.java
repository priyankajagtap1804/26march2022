package practice_all_programe;

public class Aother_class_constructor extends constructor {
	String a="radha";
	int m=50;
	int c;
	Aother_class_constructor(String a)
	{
		System.out.println(this.a);
	}
	Aother_class_constructor(int a,int b)
	{
		m=a;
		c=b;
		
	}
	public static void m5()
	{
		System.out.println("zirodha");
	}
	public void m2()
	{
		System.out.println(a+"--------"+m);
	}
	public void m3()
	{
		System.out.println(m*c);
	}
	public static void m4()
	{
		System.out.println("print");
	}
	public static void main(String[] args) {
		String i="priya";
		Aother_class_constructor ref=new Aother_class_constructor(i);
		Aother_class_constructor ref1=new Aother_class_constructor(30,20);
		ref.m1();
		ref.m2();
		ref1.m3();
	   constructor.m5(10);
	   ref.m5();
	   constructor a2=new  Aother_class_constructor(i);
	   a2.m5();
			   
	   
	}
}
