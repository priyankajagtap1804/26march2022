package practice_all_programe;
import java.util.*;
public class switch_statement {
	public static void main(String[] args) {
	Scanner sc1=new Scanner(System.in);
	int a=sc1.nextInt();
	switch(a)
	{
	case 1:System.out.println("january");
	break;
	case 2:System.out.println("feburary");
	break;
	case 3:System.out.println("march");
	break;
	case 4:System.out.println("april");
	break;
	case 5:System.out.println("may");
	break;
	default:System.out.println("please enter valid value");
	}

}
}