package com.ThreadsProgram.Drashti;

public class Thread2 {
public static void main(String[] args) {
	MyThread1 m = new MyThread1();
	 Thread t1 = new Thread(m,"D1");
	 Thread t2 = new Thread(m,"D2");
	 t1.start();
	 t2.start();
}
}

class MyThread1 implements Runnable
{
	public void run() {
		for(int i=0;i<=10;i++)
		{
			String name=Thread.currentThread().getName();
			System.out.println(name+  "i="+i);
			if("t1".equals(name));
			Thread.yield();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
		}
}
