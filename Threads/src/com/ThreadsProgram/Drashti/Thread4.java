package com.ThreadsProgram.Drashti;

public class Thread4 extends Thread{
	
	public void run()
	{
		System.out.println("running");
	}
public static void main(String[] args) {
	
	Thread4 t1 = new Thread4();
	Thread4 t2 = new Thread4();
	Thread4 t3 = new Thread4();
	System.out.println("Priority of t1 "+t1.getPriority());
	System.out.println("Priority of t2 "+t2.getPriority());
	System.out.println("Priority of t3 "+t3.getPriority());
	
	t1.setPriority(6);
	t2.setPriority(3);
	t3.setPriority(9);
	
	System.out.println("Priority of t1 "+t1.getPriority());
	System.out.println("Priority of t2 "+t2.getPriority());
	System.out.println("Priority of t3 "+t3.getPriority());
	
	System.out.println("currently Executed Thread"+Thread.currentThread());
	System.out.println("priority"+Thread.currentThread().getPriority());
	
	Thread.currentThread().setPriority(10);
	
	System.out.println("priority"+Thread.currentThread().getPriority());
	
}
}