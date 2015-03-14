// $Id$
package be.zatenzu.scjp.thread;

import be.zatenzu.scjp.thread.runnable.MyRunnableClass;
import be.zatenzu.scjp.thread.thread.MyThread;

public class Main
{

  public static void main(String[] args)
  {
    //create a thread based on a runnable
    MyRunnableClass myRunnable = new MyRunnableClass();
    Thread thread = new Thread(myRunnable);

    //create a thread based on an other thread (thread implements runnable)
    Thread threadFromThread = new Thread(new MyThread());
    
    //constructor
    /** default **/
    new Thread();
    /** runnable, string **/
    new Thread(new MyThread(), "ThreadName");
    /** runnable **/
    new Thread(new MyThread());
    /** string **/
    new Thread("ThreadName");
    
    //run a thread
    thread.start();
    //start a second time a thread
    thread.start(); //throw IllegalStateException
    
    /*
     * /!\ thread.run(); ! doesn't start the thread!
     */
    
    //get the thread name
    Thread namedThread = new Thread("MyThread");
    namedThread.getName();
    
    //get the thread of a Runnable object
    new Thread(new Runnable()
    {
      
      @Override
      public void run()
      {
        Thread.currentThread();
      }
    });
    
    /** Thread states **/
    //New
    new Thread();//the thread is in a new state.
    //not alive!
    
    //Runnable
    thread.start(); //the thread is in a runnable state until the scheduler runs it
    //thread is alive
    
    //Running
    //the scheduler runs it
    
    //wait, sleep, block on object
    
    //Dead
    
    /** ------------ **/
    
    /** priority **/
    //when the scheduler takes a Runnable thread to put it in a Running state, it looks at
    //thread with the highest priority and run it. (it's not guaranteed)
    Thread.currentThread().setPriority(Thread.MIN_PRIORITY);//1
    Thread.currentThread().setPriority(Thread.NORM_PRIORITY);//5
    Thread.currentThread().setPriority(Thread.MAX_PRIORITY);//10
    
    
    /** yield() **/
    // Running -> Runnable
    //put the running thread in Runnable state and take Runnable thread with
    //the same priority (may be him) and put it in a Running state.
    Thread.yield();
    
    
    /** join() **/
    //join the current thread to this thread.
    //the current thread can't become runnable until this thread is done.
    try
    {
      thread.join();
    }
    catch (InterruptedException e)
    {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
    /** sleep **/
    //place thread to the runnable state after X mls
    try
    {
      Thread.sleep(5000);
    }
    catch (InterruptedException e)
    {
      e.printStackTrace();
    }
  }

}