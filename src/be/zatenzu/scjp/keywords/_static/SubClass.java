// $Id$
package be.zatenzu.scjp.keywords._static;

public class SubClass extends MotherClass
{
  /** inheritance works with static members!! **/
  public void myMethode(){
    System.out.println(myStaticClassVar);
    myStaticMethodA();
  }
  
  public static void main(String[] args)
  {
    
  }
}
