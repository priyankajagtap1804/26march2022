package multiple_inheritance_interface;

public class inheritate_implement implements interface1,interface_2 {
	public void m1()
	{
		System.out.println(a);
		System.out.println("complete m1 method");
	}
	 public void m2()
	{
		System.out.println("complete m2 method");
	}
	 public void m3()
	{
		System.out.println(b);
		System.out.println("complete m3 method");
	}
 public void m4()
{
	System.out.println("complte m4 method");
	}
public static void main(String[] args) {
	inheritate_implement sc1=new inheritate_implement();
	sc1.m1();
	sc1.m2();
	sc1.m3();
    sc1.m4();
	}
}
