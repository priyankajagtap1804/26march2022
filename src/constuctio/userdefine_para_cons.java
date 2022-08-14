package constuctio;

public class userdefine_para_cons {
int num1;
int num2;
userdefine_para_cons(int a,int b)
{
	num1=a;
	num2=b;
}
public void addition()
{
	System.out.println(num1+num2);
}
public void substraction()
{
	System.out.println(num1*num2);
}
public void division()
{
	System.out.println(num1/num2);
}
public static void main(String[] args) {
	userdefine_para_cons sc1=new userdefine_para_cons(1000,10);
	sc1.addition();
	sc1.substraction();
	sc1.division();
	userdefine_para_cons sc2=new userdefine_para_cons(300,10);
	sc2.addition();
	sc2.substraction();
	sc2.division();
	userdifine_para_diff_class sc4=new userdifine_para_diff_class(30,40);
	sc4.put();
	}
}
