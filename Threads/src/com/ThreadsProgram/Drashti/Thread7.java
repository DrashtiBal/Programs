package com.ThreadsProgram.Drashti;

public class Thread7 extends Thread {
	
	public void run()
	{
		try {
			Thread.sleep(1000);
			System.out.println("drashti");
			//Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			//*throw new RuntimeException*/
			System.out.println("Exception Handled"   +e);
		}
		
		System.out.println("hello");
	}	

	public static void main(String[] args) {
		Thread7 t1 = new Thread7();
		Thread7 t2 = new Thread7();
		
		t1.start();
		t1.interrupt();
		t2.start();
		}
	}
	
