package project_1;

import java.util.Scanner;

public class commandline {
	
	public static void main(String[] args) {
				
		System.out.println("select operation");
	 Scanner sc = new Scanner(System.in);
			int n1=sc.nextInt();
			String operator=sc.next();
			int n2=sc.nextInt();
			if(operator.equals("+")) {
				commandline.addition(n1,n2);
			}
			else if (operator.equals("-") ){
				commandline.sub(n1, n2);
			}

			else if (operator.equals("*")) {
				commandline.mul(n1,n2);
			}
			else if (operator.equals("/")) {
				div(n1,n2);
			}
			
			else
			{
				System.out.println("use valid operator");
			}

		
	}

	
	public static void addition(int n1, int n2) {
		System.out.println(n1+n2);
	}

	public static void sub(int n1, int n2) {
		System.out.println(n1-n2);
	}
	public static void mul(int n1, int n2) {
		System.out.println(n1*n2);
	}
	public static double div(double n1, double n2) {
		double d=n1/n2;
		return d;
	}

	
}

