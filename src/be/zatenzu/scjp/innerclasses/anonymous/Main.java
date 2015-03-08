// $Id$
package be.zatenzu.scjp.innerclasses.anonymous;

public class Main
{

  public static void main(String[] args)
  {
    
    /** simply anonymous class declaration **/
    MyClass myClass = new MyClass(){
      
      public void myMethod(){
        //redefine the myMethod from mother class MyClass
      }
      
      public void myOwnMethod(){}
      
    };//Don't forget this ;!!!
    //myClass content is an anonymous class instance that extends MyClass!
    //It's not an isntance of MyClass!
    
    myClass.myMethod();
  //myClass is a variable typed of MyClass, so it doesn't know myOwnMethod.
//    myClass.myOwnMethod();
    
    /** from interface **/
//    MyInterface myInterface = new MyInterface();//I can't, it's an interface.
    MyInterface myInterface = new MyInterface(){

      @Override
      public void myInterfaceMethod()
      {
        //must be defined!
      }
      
    };
    
    /** from abstract class **/
    MyAbstractClass myAbstractClass = new MyAbstractClass(){

      @Override
      void myAbstractMethod()
      {
        //must be defined!
      }
      
    };
  }

}
