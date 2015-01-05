// $Id$
package be.zatenzu.scjp.keywords._super;

public class _Super extends MySuperClass
{
  public _Super(){
    //Invocation of a superclass constructor must be the first line in the subclass constructor!
    //super(); //implicit
    System.out.println("_Super contructor");
    // /!\ if no default constructor with no args is defined in super class -> compilation error
  }
  
  public _Super(int i){
    //Invocation of a superclass constructor must be the first line in the subclass constructor!
    //super();//implicit
    super(i);
    System.out.println("_Super contructor");
  }
  
  @Override
  public void myMethod()
  {
    super.myMethod();
    System.out.println("MyMethod");
  }

  public static void main(String[] args)
  {
    _Super s = new _Super();
    _Super ss = new _Super(2);
    s.myMethod();
  }
}
