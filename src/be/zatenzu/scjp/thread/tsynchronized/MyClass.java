// $Id$
package be.zatenzu.scjp.thread.tsynchronized;

public class MyClass
{
  public synchronized void mySynchronizedMethod(){
    //if a thread inter here, I lock me.
    //when the thread go out of here, I unlock me
    //A thread cannot enter here or in a other 
    //non static synchronized method of me if I'm locked.
    // /!\ Only one lock by class instance!!
    //If a thread wants to enter here and I'm locked, it waits,
    //goes to runnable state util the scheduler puts it in running state.
  }
  
  public static synchronized void myStaticSynchronizedMethod(){
    //same thing as non-static synchronized method but the lock is for the
    //class(and not for the isntance of the class). One lock for
    //all instances of this class.
    //(page 737) I'm not sure...
  }
}
