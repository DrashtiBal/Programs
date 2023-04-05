package com.chainofres;

public class Rupees10 implements Withdraw{

	Withdraw wt;
	@Override
	public void setNextChain(Withdraw chain) {
		this.wt=chain;
		
	}

	@Override
	public void withdraw(Amount amt) {
		if(amt.getAmount()>=10)
		{
			int n1=amt.getAmount()/10;
			int remainder=amt.getAmount()%10;
			System.out.println("withdraw"+ " " +n1+ " "  +"notes of 10");
			if(remainder!=0)this.wt.withdraw(new Amount(remainder));
		}
		else
		{
			this.wt.withdraw(amt);
		}
		
	}

}
