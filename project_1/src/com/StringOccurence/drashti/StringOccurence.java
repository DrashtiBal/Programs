package com.StringOccurence.drashti;

public class StringOccurence {

		public static void main(String args[])
		{
			String s="cccccbbdfeeee";
			//int repeat;
			int f[]= new int[s.length()];
			char c[]=s.toCharArray();
			//int length=c.length;
			for(int i=0;i<s.length();i++)
			{
				f[i]=1;
				
				for(int j=i+1;j<s.length();j++)
				{
				if(c[i]==c[j])
				{
					//repeat++;
					f[i]++;
					c[j]='0';
				}
				}
			}
			
			for(int i=0;i<f.length;i++)
			{
				
				if(c[i]!=' ' && c[i]!='0')
				{
				System.out.println(c[i] + " " +f[i]);
				}
			}
			
		}
	}
