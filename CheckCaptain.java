package virtusa.com;

public class CheckCaptain {

	public static void main(String[] args) {
	System.out.println("***********Singleton Pattern Demo***********");
	System.out.println("Trying to make a captain for our team");
	BillPughMethod c1=BillPughMethod.getInstance();
	System.out.println("Trying to make another captain for our team");
	BillPughMethod c2=BillPughMethod.getInstance();
	if(c1==c2)
	{
		System.out.println("You alrady have a captan for your team send him for toss");
		System.out.println("c1 and c2 are same instance");
	}

	}

}
