package practice_program;

public class paraconstructor {
	int num1;
	int num2;
	String name;
	paraconstructor(int a,int b,String c)
	{
		num1=a;
		num2=b;
		name=c;
		
	}
	public void addition()
	{
		System.out.println((num1+num2)+"    "+name);
		 
	}
	public static void main(String[] args) {
		paraconstructor sc1= new paraconstructor(10,20,"priyanka");
		sc1.addition();
		paraconstructor sc2= new paraconstructor(60,40,"pritam");
		sc2.addition();
		Paraconstructor_dffclass sc3=new Paraconstructor_dffclass(500,700);
		sc3.put();
	}
}
