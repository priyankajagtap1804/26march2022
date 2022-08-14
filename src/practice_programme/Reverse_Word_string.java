package practice_programme;

public class Reverse_Word_string {
	public static void main(String[] args) {
		String str="hello world how are you";
		String str1[]=str.split(" ");
		for(int i=0;i<=str1.length-1;i++)
		{
			
			String org=str1[i];
			String org1="";
			for(int j=org.length()-1;j>=0;j--)
			{
				
				
				  org1 =org1+org.charAt(j);
				  			
			}
			System.out.print(org1+" ");

		}
		
		
	}

}
