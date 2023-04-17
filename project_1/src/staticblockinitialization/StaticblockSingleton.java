package staticblockinitialization;

public class StaticblockSingleton {

	private static StaticblockSingleton obj1;
	private StaticblockSingleton()
	{
		System.out.println("drashti");
	}
	
	static
	{
			try {
				obj1=new StaticblockSingleton();
			} catch (Exception e) {
				//e.printStackTrace();
				throw new RuntimeException("Exception in creating of instance");
			}
		}
	
	public static StaticblockSingleton getInstance()
	{
		return obj1;
	}
	
	public void test1()
	{
		System.out.println("Instance Created");
	}
	}
