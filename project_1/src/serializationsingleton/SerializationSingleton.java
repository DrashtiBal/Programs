package serializationsingleton;

public class SerializationSingleton {

	private static SerializationSingleton obj1;
	
	public SerializationSingleton() {
	}
	private static class Helper
	{
		private static SerializationSingleton instance=new SerializationSingleton();
	}
	public static SerializationSingleton getInstance()
	{
		return Helper.instance;
	}
}
