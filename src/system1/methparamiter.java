package system1;

public class methparamiter {
	public static void main(String[] args) {
		System.out.println("print main method");
		display(10,20);
		methparamiter sc2= new methparamiter();
		sc2.display1(30,20);
}
	public static void display( int a,int b)
	{
		System.out.println("print addition------->"+(a+b));
	}
	public void display1(int a,int b)
	{
		System.out.println("subtraction of------->"+(a-b));
	}

}
