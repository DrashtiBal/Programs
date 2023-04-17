package eagerinitialization;

import singleton.Main;
import singleton.SingleInstant;

public class MainSingleton {

	public static void main(String[] args) {
		
		EagerInitializationSingleton instance = EagerInitializationSingleton.getInstance();
		
		EagerInitializationSingleton instance1 = EagerInitializationSingleton.getInstance();
		System.out.println(instance.hashCode());
		System.out.println(instance1.hashCode());
		
		test();
		test2();
		
	}
	
	public static void test() {
		SingleInstant instance2 = SingleInstant.getInstant();
		
		System.out.println(instance2.hashCode());
		
	}
	public static void test2() {
		SingleInstant instance3 = SingleInstant.getInstant();
		System.out.println(instance3.hashCode());
	
	}
	}

