package static_non_static_variables;

public class non_static_variable {
	int a=30;
	public static void main(String[] args) {
		non_static_variable sc1=new non_static_variable();		
		System.out.println("non ststic varibles in main method"+" "+sc1.a);
		non_static_variable sc2=new non_static_variable();
		sc2.disply();
		non_static_variable_callfrom_diff sc3=new non_static_variable_callfrom_diff();
		System.out.println("non static variable call from diif class"+"  "+sc3.a);	
		sc2.disply();
	}
public void disply()
{
	System.out.println("non static variable call in NSM"+" "+(a+a));
	non_static_variable_callfrom_diff sc2=new non_static_variable_callfrom_diff();
	System.out.println(sc2.a);
}
}
