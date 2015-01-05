// $Id$
package be.zatenzu.scjp.keywords._synchronized;

/**
 * See Chapter 9, Threads
 *
 */
public class _Synchronized
{
  /**
   * This keyword can be used with method or statement
   */
  
  /**
   * Method
   */
  public synchronized void myMethod(){
    /*
     * If a thread execute myMethod, all other threads who want to execute myMethod,
     * suspend execution until the first thread is out of the method.
     */
  }
  
  /**
   * Statement
   */
  //TODO
}
