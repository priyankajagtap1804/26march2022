package pattern;

public class String_fun {
	public static void main(String[] args) {
		
	String str="priyanka";
	String str1=new String("aravi");
	String str2=str+str1;
	System.out.println(str2);
	System.out.println(str1);
	System.out.println(str1.lastIndexOf('v'));	
	System.out.println(str1.charAt(1));	
	System.out.println(str2.concat(str2));	
	System.out.println(str2.contains("vi"));
		
	}

}
