package practice_programme;

public class Count_white_spaces {
	public static void main(String[] args) {
		String str="pr   iya jag tap pun e";
		int count=0;
		for(int i=0;i<=str.length()-1;i++)
		{
			char str1 = str.charAt(i);
			if(str1==' ')
			{
				count++;
			}
			
	}
		System.out.println("no of spaces into the string---------->"+count);
		
	}

}

