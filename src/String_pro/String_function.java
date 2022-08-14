package String_pro;

public class String_function {
public static void main(String[] args) {
	String s1;
	String s2="VELOCITY";
	String s3="velocity";
	String s4="";
	String s5="my name is priyanka";
	System.out.println(s2.length());
	System.out.println(s4.isEmpty());
	System.out.println(s2.toUpperCase());
	System.out.println(s3.toLowerCase());
	System.out.println(s2.equals(s3));
	System.out.println(s2.equalsIgnoreCase(s3));
	System.out.println(s2.contains("lo"));
	System.out.println(s3.charAt(1));
	System.out.println(s2.startsWith("v"));
	System.out.println(s5.endsWith("p"));
	System.out.println(s3.indexOf("c"));
	System.out.println(s2.concat(s3));
	System.out.println(s2.substring(4));
	System.out.println(s2+s3);
	System.out.println();
	}
}
