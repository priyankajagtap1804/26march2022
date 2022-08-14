package system2;
import java.util.Scanner;

import java.util.*;
public class switch_stat {
	public static void main(String[] args) {
		Scanner mad=new Scanner(System.in);
		 System.out.println("enter the value:----->");
		int a=mad.nextInt();
		
		switch(a)
		{
		case 1: System.out.println("sunday");
		break;
		case 2: System.out.println("moday");
		break;
		case 3: System.out.println("tuesday");
		break;
		case 4 :System.out.println("wednesday");
		break;
		case 5: System.out.println("thursday");
		break;
		case 6: System.out.println("friday");
		break;
		case 7: System.out.println("saturday");
		break;
		default :System.out.println(" please enter correct key");
	}

	}	

}
