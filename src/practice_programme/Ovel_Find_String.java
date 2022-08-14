package practice_programme;

public class Ovel_Find_String {
	public static void main(String[] args) {
		String str="priyankaganeshjagtap";
		
		int count=0;
		
		for(int j=0;j<=str.length()-1;j++)
		{
			char str1 = str.charAt(j);
			 
			
			if(str1=='a'||str1=='e'|str1=='i'||str1=='o'||str1=='u')
			{
				count++;
			}
			else
			{
				System.out.print(str1);
				
			}
			
		}
		System.out.println(" ");
		System.out.print("no of vovels"+count);
		
	}

}
