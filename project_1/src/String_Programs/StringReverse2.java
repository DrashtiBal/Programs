package String_Programs;

public class StringReverse2 {
	
     
	public String reverseString(String str)  
	{  
	  
	if(str.isEmpty())  
	{  
	//System.out.println("String is empty."); 
	return str ; 
	}
	//return str;   
	else   
	{  
	return reverseString(str.substring(1))+str.charAt(0);  
	}  
	}  
	public static void main(String[] args)   
	{  
		StringReverse2 rs = new StringReverse2 ();  
		String s1 = rs.reverseString("drashti balsara valsad");  
		System.out.println(s1);  
	   
	}  

}
