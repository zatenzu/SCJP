// $Id$
package be.zatenzu.scjp.innerclasses.regular;

public class OutClass
{
  private int x;
  
  //a regular inner class is a inner class that are not:
  // -Static
  // -Methode-Local
  // -Anonymous
  class MyRegularInnerClass{
    public void myInnerClasssMethod(){
      //I'm in the class OutCalss so I can access to private things.
      System.out.println("X:" + x);
      
      //To use the instance of the inner class inside the inner class:
      System.out.println("Inner class instance:" + this);
      
      //To use the instance ou the outer class:
      System.out.println("Outer class instance:" + OutClass.this);
    }
  }
  
  protected void myMethod(){
    //I'm in the current running OutClass so I can
    //use MyRegularInnerClass directly like this:
    MyRegularInnerClass mric = new MyRegularInnerClass();
    mric.myInnerClasssMethod();
  }
  
  //The inner class is a member of the OutClass so It can be:
  //- abstract
  abstract class MyAbstractRegularInnerClass{}
  
  //-final
  final class MyFinalRegularInnerClass{}
  
  //-public, protected, private
  public class MyPublicRegularInnerClass{}
  protected class MyProtectedRegularInnerClass{}
  private class MyPrivateRegularInnerClass{}
  
  //static but it's not a regular inner class!
  static class MystaticInnerClass{}
  
  //strictfp
  strictfp class MyStrictfpRegularInnerClass{}
  
}
