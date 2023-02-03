package com.ThreadsProgram.Drashti;

public class Thread8 {
 
	
	public static void main(String[] args) {
		Parent1 d1 = new Parent1();
		
		
		Thread t1 =new Thread(new Runnable() {
			
			@Override
			public void run() {
					d1.test1();		
			}
		});
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				d1.test2();
			}
		});
		
		t1.setPriority(10);
		t2.setPriority(1);
		t1.start();
		t1.interrupt();
		t2.start();
		System.out.println("Main Thread");
	}
}
class Parent1{
		public void test1() 
		{
			for(int i=0;i<=10;i++)
			{
				System.out.println("From 1 to 10 "+i  );
				if(i==5) {
					try {
						Thread.sleep(10000);
					} catch (InterruptedException e) {
						System.out.println("Exception Handled");	
					}
				}
				//throw new InterruptedException("Exception Handled");//System.out.println("From 1 to 10  "+i);
			}
		}
	
		public void test2()
		{
			for(int i=10;i<=20 ;i++)
			{
				System.out.println("From 10 to 20  "+i);
			}
		}
	}

