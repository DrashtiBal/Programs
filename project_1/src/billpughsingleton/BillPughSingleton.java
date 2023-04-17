package billpughsingleton;

public class BillPughSingleton {

	private BillPughSingleton()
	{
		System.out.println("drashti");
	}
	
	private static class BillPughHelper{
		private static final BillPughSingleton instance=new BillPughSingleton();
		}
	
	public static BillPughSingleton getInstance()
	{
		return BillPughHelper.instance;
	}
}
