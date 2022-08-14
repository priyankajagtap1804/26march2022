package practice_program;

public class non_static_mothod {
	public  void get(int a,int b)
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		
		non_static_mothod sc1=new non_static_mothod();
		sc1.get(20,50);
		 another_class_non_static sc2=new  another_class_non_static();
		 sc2.set(30,50);
		sc2.met("priya","poonam");
	}

}
