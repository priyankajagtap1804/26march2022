package practice_program;
import java.util.*;
public class class_variable {


	public void put()
	{
		Scanner sc5= new Scanner(System.in);
		String breed=sc5.nextLine();
		String color=sc5.nextLine();
		int age=sc5.nextInt();
System.out.println("dog breed----->"+breed+"Dog color----->"+color+"dog age----->"+age);
		
	}
	public static void main(String[] args) {
		
		class_variable sc1=new class_variable();
		sc1.put();		
}
}