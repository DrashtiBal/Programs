package com.Array.Drashti;

public class RotationOfArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7};
		//int num=1;
		System.out.println("array before rotation left");
		for (int array : a) {
			System.out.print(array+", ");
		}
		
		for(int i=0;i<a.length-1;i++)
		{
			int j,first;
			first=a[0];
			for(j=0;j<a.length-1;j++) {
			
				a[j]=a[j+1];
			}
				a[j]=first;
		}
		System.out.println();
		System.out.println("array after rotation left");
		for (int i : a) {
			System.out.print(i+", ");
		}
	}
}
