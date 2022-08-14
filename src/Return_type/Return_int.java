package Return_type;

public class Return_int {
	public static int addition(int a,int b)
	{
		int num=a+b;
		return num;
		
	}
	public static void main(String[] args) {
		int num1=addition(20,50);
		int num2=addition(2,5);
		System.out.println(num1+num2);
		System.out.println(addition(3,5));
		
	}

}
