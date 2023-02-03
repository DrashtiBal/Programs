package project_1;

import java.util.Scanner;

public class sum {
	public static void main(String[] args) {

		int[] a = { 2, 3, 1, 4, 5 };
		// int ans=8;

		System.out.println("array elements ");
		/*
		 * for(int int i=0;i<a.length;i++) { System.out.println(a[i]);
		 * System.out.println(); }
		 */

		// foreach loop to print array
		for (int i : a) {
			System.out.println(i);
		}
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		i: for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < a.length; j++) {
				if (a[i] + a[j] == num) {
					System.out.println(a[i]);
					System.out.println(a[j]);
					break i;

				}

			}
		}

	}
}
