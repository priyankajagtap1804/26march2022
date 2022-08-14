package practice_program;

public class String_palindrome {
	public static void main(String[] args) {
		String name="madamr";
		int ing=name.length();
		String rev="";
		int i;
		for( i=ing-1;i>=0;i--)
		{
			
			rev=rev+name.charAt(i);
		}
				if(name.equals(rev))
				{
					System.out.println("string is palindrome");
				}
					else
					{
						System.out.println("string is not palindrome");
					}
				
				
				
			}
}	


