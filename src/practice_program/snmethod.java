package practice_program;

public class snmethod{
int null1;int null2;
snmethod(int a,int b)
{
	null1=a;
	null2=b;
}


	public static void main(String[] args) {
		diplay("priya");
		diplay("jagtap");
		snmethod sc1=new snmethod(40,40);
		sc1.put();
	
		
	
	}
		public static void diplay(String c)
		{
			
			System.out.println(c);
		}
		public void put()
		{
		 
		 System.out.println(null1+null2);
		}


}
