package constuctio;

public class usrdefinecon {
	int a;
	int b;
	usrdefinecon()  //user define constructor
	{
		a=30;
		b=40;
	}
	public static void main(String[] args) {
		usrdefinecon sc2=new usrdefinecon();
		sc2.display();
		userdefine_cons_dffclass sc3=new userdefine_cons_dffclass();//call constructor of another class
		sc3.put(); // call non static method
	}
	public void display()
	{
		System.out.println("print the value-------->"+(a+b));
	}
}

