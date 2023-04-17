package billpughsingleton;

public class MainSingleton {

	public static void main(String[] args) {
		
		BillPughSingleton instance = BillPughSingleton.getInstance();
		BillPughSingleton instance1 = BillPughSingleton.getInstance();
		System.out.println(instance);
		System.out.println(instance1);
	}
}
