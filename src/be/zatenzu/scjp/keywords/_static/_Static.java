// $Id$
package be.zatenzu.scjp.keywords._static;

/**
 * Static keyword can be used on a field, method, inner class or import.
 *
 */
public class _Static
{
  static{
    //my static bloc of code
    int myStaticVarFromStaticBlock = 3;
  }
  
  public int myInt;
  
  /**
   * Static import
   * See _import keyword package
   */
  
  /**
   * Static field, called 'class variable'
   * This attribute is unique in the whole Java Virtual Machine. All _Static instances use the same attribute!
   * static keyword must be before variable type.
   */
  protected static Integer myVar;
  
  //static keyword must be before variable type.
  //protected int static myVar2; -> forbidden
  
  //static + final = constant
  //// It is recommended to place static keyword after the access modifier and before the final keyword:
  protected static final int myConst = 2;
  
  public static void main(String[] args)
  {
    /** no inheritance with static members!!! **/
//    _Static.myClassVar;
//    _Static.myStaticMethodA();
    
//    System.out.println(myInt);//myInt is not static and we are in a static method.
    System.out.println(myVar);//static var can be used whitout initialisation, no NPE, no compilation faild, just print null
    System.out.println(_Static.myVar); //no instance is required to access to myVar
    
    //class variable can be refrered from an instance. 
    _Static s = new _Static();
    System.out.println(s.myVar);
    s.myStaticMethod();
    //but this is discouraged because it does not make it clear that they are class variables
    
    //in a static method, you cannot call a non static method
    myStaticMethod();
    //myMethodA(); -> forbbiden
    
    //Cannot use this in a static context
    //this.myInt; -> forbidden
    
    //new instance of static nested class
    new _Static.MyStaticNestedClass();
    //new instance of inner class
    s.new MyInnerClass();
    
    //block variable exists until the end of the block code, static or not!
//    System.out.println(myStaticVarFromStaticBlock);
  }
  
  public void myMethodA(){};
  
  /**
   * Static methods
   */
  public static int myStaticMethod(){
//    static Integer i = 0;//cannot declare static local var
    //Cannot make a static reference to the non-static field myInt
    //return myInt; -> forbidden
    return myVar;
  }
  //static keyword must be before the return type method
  //public void static myMethod(){}; -> forbidden
  
  //cannot be use with abstract method.
  //public static abstract void myMethod();
  
  public static void myStaticMethodA(){}//--> Not overrindding because myStaticMethodA is static in MotherClass!
  
  /**
   * Static inner class or static nested class
   */
  static class MyStaticNestedClass{
  }
  
  /** Shadowing( the local var hides the class variable myVar **/
  static void MyStaticMethod(Integer myVar){
    System.out.println(myVar);
  }
  
  /**
   * Inner class or nested class
   * @author tda
   *
   */
  class MyInnerClass{
    
  }
}