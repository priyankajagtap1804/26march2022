package practice_programme;

public class Rev_String {
	public static void main(String[] args) {
		
	
	String str="madam";
	String rev="";
	for(int i=str.length()-1;i>=0;i--)
	{
		rev=rev+str.charAt(i);
		
	}
	System.out.println(rev);
	
	if(rev.equals(str))
	{
		System.out.println("string is palindrome");
	}
	else
	{
		System.out.println("String is not palindrome");
	}
	}
}
