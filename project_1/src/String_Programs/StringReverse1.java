package String_Programs;

public class StringReverse1 {
	
	static String reverse(String s)
	  {
	    if (s==null || s.length()<=1) 
	    {
	      return s;
	    }
	    else { 
	    	String ss=reverse(s.substring(1))+s.charAt(0);
	  	return ss;
	    }
	  }
	 
	  public static void main(String[] args)
	  {
	   String s="balsara drashti";
	   System.out.println(reverse(s));
	  
	   
	  }

}
