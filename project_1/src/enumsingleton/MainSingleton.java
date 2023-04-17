package enumsingleton;

public class MainSingleton {

	public static void main(String[] args) {
		
		EnumSingleton obj1 = EnumSingleton.obj1;
		EnumSingleton obj2= EnumSingleton.obj1;
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}
	
}
