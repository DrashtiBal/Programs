package com.chainofres;

import java.util.Scanner;

public class ATMWithdraw {
private Withdraw wt;
	
	public static void main(String[] args) {
	
	
	
	System.out.println("enter amount to be withdraw:");
	Scanner sc=new Scanner(System.in);
	int amount=sc.nextInt();
	
	Withdraw fifty=new Rupees50();
	Withdraw twenty=new Rupees20();
	Withdraw ten=new Rupees10();
	fifty.setNextChain(twenty);
	twenty.setNextChain(ten);
	fifty.withdraw(new Amount(amount));
	//twenty.withdraw(new Amount(amount));
	
	}
}
