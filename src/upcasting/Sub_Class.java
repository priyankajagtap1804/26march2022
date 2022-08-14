package upcasting;

public class Sub_Class extends Super_class {
	public void bike()
	{
		System.out.println("CBZ");
	}
	public void money()
	{
		System.out.println("5.4 lakh");
	}
	public void car()
	{
		System.out.println("seltos kia");
	}
	public static void main(String[] args) {
		Super_class s1=new Sub_Class();
		s1.car();
		s1.money();
		s1.flat();
		Sub_Class s2=new Sub_Class();
		s2.car();
		s2.money();
		s2.flat();
		s2.bike();
	}

}

