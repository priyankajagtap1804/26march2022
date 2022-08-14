package practice_program;

public class Constructor {
	
	int a; int b;
	static int c=1150; 

	Constructor()
	{
		
		a=10;
		b=20;
	}
	
	
	
	public static void main(String[] args) {
		
		Constructor sc1 = new Constructor();
		sc1.add();
		System.out.println(c);
        mul();
        
 
        
        }
	
	public  void add() {
		
		System.out.println(a+b);
		
	}
	public static void mul() {
		//System.out.println(a+b);
		
		Constructor sc2= new Constructor();
	
		
		
		System.out.println(sc2.a*sc2.b);
		
		
	}
	
	
}
