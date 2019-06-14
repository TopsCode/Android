package com.fundamentals;
class ThreadDemo extends Thread
{
	public void run()
	{
		System.out.println("Thread Name:"+Thread.currentThread().getName()+" Thread Priority: "+Thread.currentThread().getPriority());
	}
}
public class ThreadPriorityDemo {
	public static void main(String[] args) {
		ThreadDemo t1=new ThreadDemo();
		ThreadDemo t2=new ThreadDemo();
		ThreadDemo t3=new ThreadDemo();
		ThreadDemo t4=new ThreadDemo();
		
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		t4.setPriority(6);
		
		t1.setName("my_t1");
		
	t1.start();
	t2.start();
	t3.start();
	t4.start();
	}

}
