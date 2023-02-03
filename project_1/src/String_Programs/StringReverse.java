package String_Programs;

public class StringReverse {

	public static void main(String[] args) {
		
		String s1="balsara";
		StringReverse sr = new StringReverse();
		sr.reverse(s1);
		
	}
	
	  void reverse(String s1)
	{

		if(s1==null)/*((String) s1).length()<=1)*/
		{
			System.out.println(s1);
		}
		else
		{
			System.out.println(((String) s1).charAt(((String) s1).length()-1));	
			
			reverse(((String) s1).substring(0,(((String) s1).length()-1)));
			}
	}
	}


