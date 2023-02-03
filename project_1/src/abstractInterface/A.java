package abstractInterface;

public class A {  
		public static void main(String args[]){  
		
			I a=new C();  
		a.a();  
		a.b();  
		a.c(); 
		//I i;
		//System.out.println(i.c());
		//I i;
		//i=new 
		a.d(); 
		System.out.println(a.c());
		}
}
	interface I{  
		void a();//bydefault, public and abstract  
		void b();  
	    int c();  
		void d();  
		}  
		  
		//Creating abstract class that provides the implementation of one method of A interface  
		abstract class B implements I{  
		public int c()
		{
			return 10;
			//System.out.println("I am C");
			//eturn 10;
		} 
		}
		  
		//Creating subclass of abstract class, now we need to provide the implementation of rest of the methods  
		class C implements I{  
		public void a(){System.out.println("I am a");}  
		public void b(){System.out.println("I am b");}  
		public void d(){System.out.println("I am d");} 
		public int c()
		{
			return 10;
			//System.out.println("I am C");
			//eturn 10;
		} 
		}  
		  
