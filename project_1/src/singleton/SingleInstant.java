package singleton;

public class SingleInstant {
	
  SingleInstant(){
	 System.out.println("sjh");
 }

	static SingleInstant instant = new SingleInstant();
	
	public static SingleInstant getInstant(){
		
		return instant;
	}
	
	 
}


