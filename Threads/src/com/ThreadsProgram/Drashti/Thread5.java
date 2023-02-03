package com.ThreadsProgram.Drashti;

import java.io.IOException;

public class Thread5 extends Thread{
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("Daemon Thread");
		}
		else 
		{
			System.out.println("User Thread");
		}

	}
	
	public static void main(String[] args) throws IOException {
		
		Thread5 t1 = new Thread5();
		Thread5 t2 = new Thread5();
		Thread5 t3 = new Thread5();
		
		t1.setDaemon(true);
		
		t1.start();
		t2.start();
		t3.start();
		
		//Runtime.getRuntime().exec("notepad");//will open a new notepad  
	}
}
