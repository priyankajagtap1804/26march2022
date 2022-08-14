package Multileval_inheritance;

public class child  extends parent_class{
	public void bike()
	{
		System.out.println(" activa");
	}
	public static void main(String[] args) 
	{
		child sc1=new child();
		sc1.property();
		sc1.home();
		sc1.car();
		sc1.bike();
	}

}
