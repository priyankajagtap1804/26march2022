package String_pro;

	public class String_pro1 {
		public static void main(String[] args) {
			int a=10;
			int b=0;
			int c;
		
		try {
			 c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException f)
		{
			System.out.println("error handled");
		}
			
		}

}
