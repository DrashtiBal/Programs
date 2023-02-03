package com.ThreadsProgram.Drashti;
class One extends Thread{
	public void run()
	{
		 synchronized (this)
	        {
		System.out.println(Thread.currentThread().getName() + "starts");
		
		try {
			
			this.wait();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//this.notify();
		System.out.println(Thread.currentThread().getName()+"Notified");
	}
	}
}

class Two extends Thread{
   One a;
	Two(One a)
	{
		this.a=a;
	}
	public void run()
	{
		synchronized (this.a)
        {
		System.out.println(Thread.currentThread().getName() + "starts");
		
		try {
			
			this.a.wait();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName()+"Notified");
	}
	}
}

class Three extends Thread{
 One a;
	Three(One a)
	{
		this.a=a;
	}
	public void run()
	{
		synchronized (this.a)
        {
		System.out.println(Thread.currentThread().getName() + "starts");
		
		this.a.notifyAll();
		System.out.println(Thread.currentThread().getName()+"Notified");
	}
	}
}

class Thread6 {

	public static void main(String[] args) throws InterruptedException {
		
		One i = new One();
		Two j = new Two(i);
		Three k =new Three(i);
		
		Thread t1 = new Thread(i,"thread1");
		Thread t2 = new Thread(j,"thread2");
		Thread t3 = new Thread(k,"thread3");
		
		t1.start();
		t2.start();
		Thread.sleep(100);
		t3.start();
		
		
	}
}
	

