package com.Array.Drashti;

public class Array2 {
	

	public static int  test(int array[],int length)
	{
		
		int temp;
	for(int i=0;i<=length;i++)
	{
		for(int j=1;j<=length;j++)
				{
					if(array[i]>array[j])
					{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
					}
				}
	}
	return array[0];
	}
	public static void main(String[] args) {
		int a[]={20,5,30,2};
		System.out.println("min number is:"+test(a,3));;
		int length=a.length;
	}
}
