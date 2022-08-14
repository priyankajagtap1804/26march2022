package practice_all_programe; 
 class swapping_prog {

public static void main(String[] args) {
	swapping_prog sc1=new swapping_prog();  
	sc1.swap(20,30);
}
	

public void swap(int a,int b)
{
	int d;
d=a;
a=b;
b=d;
System.out.println("value of a"+a);
System.out.println("value of b"+b);
}

 }
