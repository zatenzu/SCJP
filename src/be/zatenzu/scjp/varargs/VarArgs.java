// $Id$
package be.zatenzu.scjp.varargs;

public class VarArgs
{
  /*  Legal */
  public void myMethod(String... args){};
  public void myMethod(int a ,String... args){};
  public void myMethod1(int a ,String ... args){};//with space between String and ellipsi(...)
  
  /* Illegal
  public void myMethod(String args...){};//Ellipsis must be after parameters type
  public void myMethod(String... args, int a){};//var-args must bt the last parameter
  public void myMethod(String... args, int... as){};//Only one var-args parameter
  */
}
