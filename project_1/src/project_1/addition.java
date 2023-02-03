package project_1;

import java.util.Scanner;

public class addition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("num1");
		int num1 = sc.nextInt();
		// System.out.println("num2");
		int num2 = sc.nextInt();
		// System.out.println("num3");
		int num3 = sc.nextInt();

		if (num1 > num2 && num1 > num3) {
			System.out.println("largest is:" + num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("largets is:" + num2);
		} else {
			System.out.println("largest is:" + num3);
		}
	}

}
