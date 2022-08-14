package practice_programme;

public class String_Reverse_eachword_sentence {
	public static void main(String[] args) {
		String str="priyanka ganesh jagtap";
		String str1[]=str.split("");
		char str2;
	
		for(int i=str.length()-1;i>=0;i--)
		{
			str2=str.charAt(i);
			System.out.print(str2);
			
		}
		
		
	}

}
