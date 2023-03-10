package String_Programs;

public class StringCompare {
	 public static void main(String[] args)
	    {
	        String s1 = "HELLO";
	        String s2 = "HE";
	        String s3= "HELLO";
	        String s4 =  new String("HELLO");
	        String s5= new String("HELLO");
	        System.out.println(s1 == s2); // true
	        System.out.println(s1 == s3); // true
	        
	        System.out.println(s1.equals(s2)); // true
	        System.out.println(s1.equals(s4)); // true
	        System.out.println(s4.equals(s5));
	        System.out.println("just concate: ");
	        s4.concat("world");
	        System.out.println(s4);
	        System.out.println(s1.equals(s4));
	        System.out.println("after concate and store in ref variable: ");
	        s4=s4.concat("world");
	        System.out.println(s4);
	        System.out.println(s1.equals(s4));
	        System.out.println(s4);
	        System.out.println("before: "+s1);
	        s1="world";
	        System.out.println("after: "+s1);
	        System.out.println(" after changing s1 value: " +s1==s3);// false
	    }
}
