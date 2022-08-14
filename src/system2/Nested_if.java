package system2;

public class Nested_if {
	public static void main(String[] args) {
		int coup=1000;
		if(coup>=5000)
		{
			System.out.println("you get presure cooker");
			{
				if(coup>=7000)
				{
					System.out.println("you get mobile");
				}
				else
				{
					System.out.println("you get nothing ");
				}
			}
		}
		
		else
		{
			System.out.println("you are not eligible for anythimg");
		}
		
		}

}
