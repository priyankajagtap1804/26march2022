package constuctio;

public class userdefine_cons_dffclass {
	int c;
	int d;
	userdefine_cons_dffclass()  //user define constructor
	{
		c=140;
		d=130;
	}
	public void put()  //non static method
	{
		System.out.println("print the value-------->"+(c+d));
	}

}
