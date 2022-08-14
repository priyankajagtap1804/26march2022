package system1;

public class staticmethod {
	public static void main(String[] args) {
		
		display();
		staticmethod pro=new staticmethod();
		pro.put();
		 methdifclass.get();
		   methdifclass pro1=new methdifclass();
		   pro1.set();
		

		}
	public static void display()
	{
		System.out.println("hii i am static method call in same class");
	}
	public void put()
	{
		System.out.println("hii i am non static method call in same class");
	}
	 
}
