package static_non_static_variables;

public class static_variables {
	static int a=10;
	public static void main(String[] args) {
		System.out.println("hii world");
		System.out.println("Globle variable of same class in main method"+"    "+a);
		put(10,20);
		 static_variables sc1= new static_variables();
		 sc1.display();//call  non static method in same class
		// static_variables_callfrom_diff sc2=new static_variables_callfrom_diff();
		 System.out.println(static_variables_callfrom_diff.a);	//static variable call from diff class
		 System.out.println(a+static_variables_callfrom_diff.a*2);//static variable call from diff class
		 static_variables sc3=new static_variables();//non static method call in same class
		 sc3.display();
		 }
	public static void put(int b,int c)

	{
		System.out.println("static method"+"   "+a+b+c);
		System.out.println("Globle variable of diff class "+"   "+static_variables_callfrom_diff.a);
	}
	public void display()
	{
		System.out.println( "static globle varible in non static method same class"+"   " +a);
		System.out.println("Globle variable of diff class in non static method"+"   "+static_variables_callfrom_diff.a*a);
	}
}
