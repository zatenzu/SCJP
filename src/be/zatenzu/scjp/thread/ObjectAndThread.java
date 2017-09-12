// $Id$
package be.zatenzu.scjp.thread;

public class ObjectAndThread
{
  public static void main(String[] args)
  {
    /** wait() throws InterruptedException **/
    //release the lock on the object and the current thread waits until notify on the object
    /** notify() **/
    //wake up the first thread who calls wait on this object
    /** notifyAll() **/
    //wake up all thread who call wait on this object
    
    
    // these methods can be called only if the current thread has locked the object.
    Object a = new Object();
    try
    {
      a.wait();
    }
    catch (InterruptedException e)
    {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    // --> IllegalMonitorStateException 
    //I don't lock a before call wait()
    
    // correct exemple
    Object b = new Object();
    synchronized(b){//put the lock on b
      try
      {
        //ok I can, I have put the lock on b
        b.wait();//realese the lock on b and wait until notify on b
      }
      catch (InterruptedException e)// /!\
      {
        e.printStackTrace();
      }
    }
    
    synchronized(b){
      b.notify();
    }
    
  }
  
}
