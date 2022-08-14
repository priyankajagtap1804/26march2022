package abstract_concrete_class;

public class concreate_class extends abstract1 {
	public void m2()
	{
		System.out.println("complete the method using concreate ");
	}
	public void m3()
	{
		System.out.println("complete the method using concreate");
	}

	public static void main(String[] args) {
		concreate_class sc1=new concreate_class();
		sc1.m1();
		sc1.m2();
		sc1.m3();
	}
}
