package com.Array.Drashti;

public class Array3 {

	public static void main(String[] args) {
		
	int a []={1,2,3,4,5};
	int b[]= new int[a.length];
	System.out.println(b.length);
	for(int i=0;i<a.length;i++)
	{
		b[i]=a[i];
	}
	System.out.println("array 1");
	for(int i=0;i<a.length;i++)
	{
		
		System.out.print(" "+a[i]);
	}
	System.out.println();
	System.out.println("array 2");
	for(int i=0;i<b.length;i++)
	{
		
		System.out.print(" "+b[i]);
	} 
		
	}
}
