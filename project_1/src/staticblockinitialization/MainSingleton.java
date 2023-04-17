package staticblockinitialization;

public class MainSingleton {

	public static void main(String[] args) {
		
		StaticblockSingleton instance = StaticblockSingleton.getInstance();
		instance.test1();
		System.out.println(instance.hashCode());
		StaticblockSingleton instance1 = StaticblockSingleton.getInstance();
		instance1.test1();
		System.out.println(instance1.hashCode());
		
	}
}
