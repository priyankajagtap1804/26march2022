package practice_all_programe;

public class if_elseif_else {
	public static void main(String[] args) {
		
		int marks=85;
		String grade;
		if(marks>=60)
		{
			System.out.println("fist class");
		}
		else if(marks>=50)
		{
			System.out.println("second class");
		}
		else if(marks>=35)
		{
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
	}

}
