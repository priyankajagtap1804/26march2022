package system2;

public class nest_if {
	public static void main(String[] args) {
		int age=17;
		int weight=57;
		if(age>=18)
		{
			System.out.println("he is allow to donate blood");
			{
				if(weight>=50)
				{
					System.out.println("he can donate his blood");
				}
				else
				{
					System.out.println("he is not eligible");
				}
			}
		}
		else
		{
			System.out.println("his age is less than 18");
		}
		
	}

}
