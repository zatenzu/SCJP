// $Id$
package be.zatenzu.scjp.constructor;

public class Constructor
{
  static{
    System.out.println("This block runs before constructor call");
  }
  
  {
    System.out.println("This block runs after constructor call");
  }
  //All access modifiers are allowed
  //Constructor must have the same name as the Class
  public Constructor(){}
  //if no constructor is defined in the class, this default constructor is implicit!
  
  //can be protected
  protected Constructor(int i){}
  
  //can be default package
  Constructor(float i){}
  
  //can be private
  private Constructor(int i, int a){}
  
  //can have var-arg parameter
  public Constructor(String... args){}
  
//Constructor can't ever have a return type.
//Here, there is a return type but it's not a constructor, it's a badly named method.
  public void Constructor(){}//it's a method !!
  
  //A constructor can't be static!
//  public static Constructor(){};
  
  //A constructor can't be abstract!
//public abstract Constructor(){};
  
  //A constructor can't be final!
//public final Constructor(){};
}
