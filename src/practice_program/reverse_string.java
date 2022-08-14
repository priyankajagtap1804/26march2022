package practice_program;

public class reverse_string {
	public static void main(String[] args) {
		String name="priyanka";
		int length=name.length(); 
		String rev="";
		for(int i=length-1;i>=0;i--)
		{
			
			rev=rev+name.charAt(i);
			
		}
		System.out.print(rev);
	}
	
	

}
