package virtusa.com;

public class BillPughMethod {

	private BillPughMethod()
	{
		
		 System.out.println("New captan selected for our team");
	}
	private static class BillPughSingletone
	{
		private static final BillPughMethod INSTANCE=new BillPughMethod();
	}
	public static BillPughMethod getInstance()
	{
		return BillPughSingletone.INSTANCE;
	}

}
