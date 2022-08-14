package Return_type;

public class string_return {
	public static String convertintouppercase(String name)
	{
		
		String s1=name.toUpperCase();
		return s1;
		
	}
	public static void main(String[] args) {
		String s2=convertintouppercase("abc");
		System.out.println(s2);
	}

}
