// $Id$
package be.zatenzu.scjp.innerclasses.staticnested;

public class Main
{
  static class MyStaticInnerClass{
    public void method(){
      System.out.println("Hi from static nested inner class method!");
    }
  };

  public static void main(String[] args)
  {
    /** new instance of static inner class **/
//    OutClass.MyStaticNestedInnerClass myStaticNestedInnerClass = new OutClass().MyStaticNestedInnerClass();//????
    
    MyStaticInnerClass myStaticInnerClass = new MyStaticInnerClass();
    
  }
  
  public void method(){
    MyStaticInnerClass myStaticInnerClass = new MyStaticInnerClass();
  }

}
