// $Id$
package be.zatenzu.scjp.keywords._abstract;

//public abstract final class -> stupid and forbidden
// final cannot be extend and abstract is made to be extend
public abstract class _Abstract
{
  //only with one abstract method, and your class must be abstract too
  public abstract void myMethod();
  
  // private and abstract, forbidden
//  private abstract void myMethod1();
  
  //abstract and final, forbidden
//  public abstract final void myMethod1();
  
  //abstract + static -> forbidden
//  public abstract static void myMethod2();
  
  public static void main(String[] args)
  {
    /** abstract class cannot be instantiated **/
//    new _Abstract(); --> forbbiden, -> compiler error
    
    /** Anonimous class based on abstract class -> ok **/
    new _Abstract()
    {
      
      @Override
      public void myMethod()
      {
        // TODO Auto-generated method stub
        
      }
    };
  }
}
