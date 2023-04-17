package lazyinitialization;

public class LazyInitialization {

	private static LazyInitialization obj1;
	
	private LazyInitialization()
	{
		System.out.println("drashti");	
	}
	public static LazyInitialization getInstance()
	{
		if(obj1==null)
		{
			obj1=new LazyInitialization();
		}
		return obj1;
	}
	public void test1()
	{
		System.out.println("Instance Created");
	}
}
