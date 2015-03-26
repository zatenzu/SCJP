// $Id$
package be.zatenzu.scjp.keywords._interface;

/**
 * 
 * Interface is a 100% abstract class!
 *
 */
/**
 * Interface can extend one or more interfaces
 * Interface cannot extend class
 * Interface cannot implement interface
 * private or protected interface is forbidden, interface is public or default package
 */
public /** abstract (implicit) **/ interface _Interface
{
  /**  interface variables are always constants so public static final are implicit!!**/
  /** only public, static final, nothing else **/
  public static final int MY_CONST = 1;
  public static int MY_CONST_A = 1;
  public int MY_CONST_B = 1;
  int MY_CONST_C = 1;
  
  /** Methods **/
  void myMethod1();
  public abstract void myMethod2();
  //public and abstract are implicit
  
//  void myNonAbtractMethod(){}; --> Forbidden, only abstract method in interface!
//  abstract static void myStaticMethod(){};//--> Forbidden, cannot be static in interface
  
  /** Methods can only be abstract and public **/
}
