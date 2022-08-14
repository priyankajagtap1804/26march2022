package practice_all_programe;

public class string1_reverse {
	public static void main(String[] args) {
		String a="madam1";
		String rev="";
		System.out.println(a);
		for(int i=a.length()-1;i>=0;i--)
		{
			rev=rev+a.charAt(i);
			
			
		}
		
	
		System.out.println(rev);
		if(a.equals(rev))
		{
			System.out.println("string is palidrome");
		}
		else
		{
			System.out.println("string is not palindrome");
		}
	}
	

}
