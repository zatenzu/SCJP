// $Id$
package be.zatenzu.scjp.thread.thread;

public class MyThread extends Thread//Thread implements Runnable
{

  @Override
  public void run()
  {
    //my threaded code
  }
  
  //overloaded run methode
  public void run(String s)
  {
    //Ignored by the Thread class
  }
  
}
