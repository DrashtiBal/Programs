package String_Programs;

public class Concate {
	
	public static void main(String args[]){    
		String s1="java string";   
		String s2="Drashti";
		// The string s1 does not get changed, even though it is invoking the method      
		// concat(), as it is immutable. Therefore, the explicit assignment is required here.  
		s1.concat("is immutable");    
		System.out.println(s1);    
		s1=s1.concat(" is immutable so assign it explicitly ");  
		s1=s1.concat( s2);
		System.out.println(s1);   
		String s3 = s2.concat("@").concat(s1);  
		System.out.println(s3);
		}   

}
