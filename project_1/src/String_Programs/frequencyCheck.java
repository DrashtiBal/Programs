package String_Programs;



public class frequencyCheck {

	public static void main(String[] args) {
		
		String s1="ttttuorialtt";
		int count=0;
		
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='t')
				count++;
		}
		System.out.println("count is"+count);
	}
}
