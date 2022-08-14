package system1;

public class methodpro {
	public static void main(String[] args) {
		dispaly4(1,"priyanka jagtap","phaltan",67.8f);
		methodpro sc1=new methodpro();
		sc1.display5(40,45);
}
	public static void dispaly4(int rollno,String stdname,String cname,float marks)
	{
		System.out.println(rollno+"  "+stdname+"   "+cname+"  "+marks);
	}
	public void display5(int a,int b)
	{
		int c;
		c=a+b;
	System.out.println(c);
		
	}
}
