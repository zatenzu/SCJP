// $Id$
package be.zatenzu.scjp.innerclasses.methodlocal;

public class OutClass
{
  private int x;
  
  //OutClassMethod
  public void myMethod(){
    //local variable of the myMethod method
    int y = 0;
    final int z = 0;
    
    //Must be after the declaration of the inner class
//    MyMethodLocalInnerClass myMethodLocalInnerClass = new MyMethodLocalInnerClass();
    
    //MethodLocalInnerClass
    class MyMethodLocalInnerClass{
      //method of MyMethodLocalInnerClass
      public void myMethod(){
        System.out.println("I can see X:" + x);
//        System.out.println("I can't see Y:" + y);
        System.out.println("I can see Z but it's final:" + z);
      }
    }
    
    //OK it's after the inner class declaration
    MyMethodLocalInnerClass myMethodLocalInnerClass = new MyMethodLocalInnerClass();
  }
}
