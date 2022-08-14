package practice_program;

public class static_method {
	public static void display()
	{
		System.out.println("hii i am priyanak");
		
	}
	public static void put(int a,int b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		String name="priya";
		int no=1;
		System.out.println(name+" "+no);
		display();
		put(10,20);
	}
}
