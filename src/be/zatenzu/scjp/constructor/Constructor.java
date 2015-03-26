// $Id$
package be.zatenzu.scjp.constructor;

public class Constructor
{
//  final blank var must initialize in each constructors
  final int j;
  
  static{
    System.out.println("This block runs, one time before constructor call");
  }
  
  {
    System.out.println("This block runs after each constructor call");
  }
  //All access modifiers are allowed
  //Constructor must have the same name as the Class
  public Constructor(){
    System.out.println("This block runs during constructor call");
    j=0;
    }
  //if no constructor is defined in the class, this default constructor is implicit!

  //the auto-created(implicit default constructor) constructor will:
  // -have the same access modifier than the class
  // -no-args
  // -have as first line super();ex Constructor(){super();}
  
  //can be protected
  protected Constructor(int i){j=0;}
  
  //can be default package
  Constructor(float i){j=0;}
  
  //can be private
  private Constructor(int i, int a){j=0;}
  
  //can have var-arg parameter
  public Constructor(String... args){j=0;}
  
//Constructor can't ever have a return type.
//Here, there is a return type but it's not a constructor, it's a badly named method.
  public void Constructor(){}//it's a method !!
  
  //A constructor can't be static!
//  public static Constructor(){};
  
  //A constructor can't be abstract!
//public abstract Constructor(){};
  
  //A constructor can't be final!
//public final Constructor(){};
  
  public static void main(String[] args)
  {
    new Constructor();
  }
}
