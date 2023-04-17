package eagerinitialization;

public class EagerInitializationSingleton {

	public EagerInitializationSingleton() {
		
		System.out.println("drashti");
		
	}
	private static final EagerInitializationSingleton instance =new EagerInitializationSingleton();
	
	public static EagerInitializationSingleton getInstance()
	{
		return instance;
		
	}
	
}
