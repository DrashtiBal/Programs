package String_Programs;

public class RepeatString {

		public static void main(String args[])
		{
			String s="aaaaaaabbbbbbbb";
			char c[]=s.toCharArray();
			
			int count;
			if(c.length==0 || c.length==1)
			{
				System.out.println("There Is Not Any Repetative String");
			}
			
			for(int i=0;i<s.length();i++)
			{
				
				count=1;
			for(int j=i+1;j<s.length();j++)
			{
				if(c[i]==c[j] && c[i]!=' ')
				{
					count=count+1;
					c[j]='0';
					//break;
				}
			}
		
			if(count>1 && c[i]!='0')
			{
				System.out.println(c[i]);
			}
			
		}
			
	}
	}

