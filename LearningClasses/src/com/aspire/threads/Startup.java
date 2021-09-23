package com.aspire.threads;

public class Startup {

	public static void main(String[] args) {
		try{
		// Thread t=Thread.currentThread();
		   
		   Worker t1=new Worker();
		   Worker t2=new Worker();
		   Worker t3=new Worker();
		   //Thread t1=new Thread(first);
		   //Thread t2=new Thread(first);
		   //Thread t3=new Thread(first);
		   t1.start();
		   t2.start();
		   t3.start();
		   System.out.println("Th Min priority: " +Thread.MIN_PRIORITY);
		  }
	catch(Exception e)
		  {
		   System.out.println(e.getMessage());
		  }
		//finally{
		//	System.out.println("Inside finally");
		//	Runtime rt=Runtime.getRuntime();
			//rt.exit(0);
		//}

	}
}
