package access_specifiers;

public class Default_access_specifies {
	int a;
	int b;
	 Default_access_specifies(int a,int b)
	 {
		 this.a=a;
		 this.b=b;
	 }
	 void m4()
	 {
		 System.out.println(this.a+this.b);
	 }
	 void multiplication()
	 {
		System.out.println(this.a*this.b); 
	 }
	public static void main(String[] args) {
		
		Default_access_specifies m1= new Default_access_specifies(5,7);
		m1.m4();
		m1.multiplication();
		Default_access_specifies mo= new Default_access_specifies(10,20);
		mo.m4();
		mo.multiplication();
		
	}

}
