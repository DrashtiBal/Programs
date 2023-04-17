package threadsafesingleton;

public class ThreadSafeSingleton {

	private static  ThreadSafeSingleton obj1;
	
	private ThreadSafeSingleton()
	{
		System.out.println("drashti");
	}

	public static ThreadSafeSingleton getInstance()
	{
		if(obj1==null)
		{
			synchronized (ThreadSafeSingleton.class) {
				if(obj1==null)
				{
				obj1=new ThreadSafeSingleton();
				}
			}
		}
		return obj1;
	}
	
	public void test1()
	{
		System.out.println("Instance Created");
	}
}
