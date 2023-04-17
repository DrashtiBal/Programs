package lazyinitialization;

public class MainSingleton {

	public static void main(String[] args) {
		
		
		LazyInitialization instance1 = LazyInitialization.getInstance();
		LazyInitialization instance2 = LazyInitialization.getInstance();
		
		instance1.test1();
		instance2.test1();
	}
}
