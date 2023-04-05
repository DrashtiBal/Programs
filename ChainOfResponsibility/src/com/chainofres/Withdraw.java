package com.chainofres;

public interface Withdraw {

	void setNextChain(Withdraw chain);
	void withdraw(Amount amt);
}
