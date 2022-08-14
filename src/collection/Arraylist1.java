package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylist1 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(300);
		al.add(null);
		al.add('a');
		al.add('c');
		al.add(600);
		al.add(500);
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println(al.contains('a'));
		System.out.println(al.get(1));
		// remove info in between arraylist -->left shift operation
		al.remove(4);
		System.out.println(al);
		//add info in between arraylist -->right shift operation
		al.add(1,'p');
		System.out.println(al);
		//update or modify info
		al.set(1,'g');
		System.out.println(al);
		System.out.println("print arraylist data using iterator cursor");
Iterator s1=al.iterator();
while(s1.hasNext())
{
	System.out.print(s1.next()+" ");
}
System.out.println(" \n print arraylist data using listiterator cursor");
ListIterator s2=al.listIterator();
while(s2.hasNext())
{
	System.out.print(s2.next()+" ");
}
System.out.println("\n print arraylist data using forloop");
for(int i=0;i<=al.size()-1;i++)
{
	System.out.print(al.get(i)+" ");
}
System.out.println("\n print arraylist data using each forloop");
for( Object s4:al)
{	
	System.out.print(s4+" ");	
		
	}

}
}