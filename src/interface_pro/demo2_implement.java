package interface_pro;

public class demo2_implement implements  demo1_interface  {
  public void m1()
 {
	 System.out.println(a);
	 System.out.println("method completed");
 }
  public void m2()
  {
	  System.out.println("method is completed");
  }
  public static void main(String[] args) {
	
	  demo2_implement sc1=new demo2_implement();
	  sc1.m1();
	  sc1.m2();
}
}
