package com.Array.Drashti;

public class Array2 {
	
	
	public static void main(String[] args) {
		int a[]={20,10,30,40};
		test(a);
		
	}
	
	public static void test(int array[])
	{
		//int[] a;
	int min=array[0];
		
	for(int i=1;i<=3;i++)
	{
		if(min>array[i])
				{
			
			System.out.println(min);
				}
		else {
			System.out.println("number is larger");
		}
	}
	}
}
