package singleton;

public class Main extends SingleInstant{

	public static void main(String[] args) {
		
		SingleInstant instantno = SingleInstant.getInstant();
		
		System.out.println(instantno);
		
		test();
	}
	
	public static void test() {
		SingleInstant instantffno = SingleInstant.getInstant();
		
		System.out.println(instantffno);
		Main n = new Main();
		System.out.println("call");
		n.test2();
		
	}
	public  void test2() {
		SingleInstant instant3 = SingleInstant.getInstant();
		
		System.out.println(instant3);
	
	}

}
