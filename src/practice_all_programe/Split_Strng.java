package practice_all_programe;

public class Split_Strng {
	public static void main(String[] args) {
		String s= "priyanak ganesh jagtap";
		String[] s1=s.split("");
		for(int i=s1.length-1;i>=0;i--)
		{
			System.out.print(s1[i]);
			
		}
		System.out.println(s1.length);
	}

}
