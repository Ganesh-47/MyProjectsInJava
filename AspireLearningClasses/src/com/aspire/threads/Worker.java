package com.aspire.threads;
public class Worker extends Thread{
 public int amount=0;
 @ovverride public void run(){
	 callme();
 }
 public synchronized void callme()
 {
  long thid=Thread.currentThread().getId();
  System.out.println("Inside Callme thread ID "+thid);
  
   try{
   for(int i=0;i<5;i++)
   {
    amount+=i;
    System.out.println(thid + "  " + amount);
    Thread.sleep(1000);
   }
    }catch(Exception e)
   {
    System.out.println(e.getMessage());
   }
 }
}

