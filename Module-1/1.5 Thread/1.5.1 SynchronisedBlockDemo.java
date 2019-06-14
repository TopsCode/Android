package com.fundamentals;
class First
{
	public void display(String msg)
	{
		System.out.print("["+msg);
		try
		{
			
			Thread.sleep(1000);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		System.out.print("]");
	}
}
class Second extends Thread
{
	String msg;
	First fobj;
	public Second(String msg,First fobj) {
		this.msg=msg;
		this.fobj=fobj;
		start();
	}
	public void run() {
        synchronized(fobj)
        {
		fobj.display(msg);
	    }
	    
		
		//fobj.display(msg);
    }
}
public class SynchronisedBlockDemo {

	public static void main(String[] args) {
		First f=new First();
		
		Second s1=new Second("Welcome", f);
		Second s2=new Second("new", f);
		Second s3=new Second("Java Programmer",f);

	}

}
