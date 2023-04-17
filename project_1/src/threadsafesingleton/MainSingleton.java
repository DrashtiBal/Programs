package threadsafesingleton;

public class MainSingleton {

	public static void main(String[] args) {
		ThreadSafeSingleton instance = ThreadSafeSingleton.getInstance();
		ThreadSafeSingleton instance1 = ThreadSafeSingleton.getInstance();
		instance.test1();
		instance1.test1();
	}
}
