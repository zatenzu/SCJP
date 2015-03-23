// $Id$
package be.zatenzu.scjp.keywords._enum;

public class MyClass
{
  //Can declare enum inside a class
  //it can be protected or private
  enum MyEnumInsideTheClass{
    A,B,C;// ; is not required
  }
  //A,B,C are final static
  
  public static void main(String[] args)
  {
    System.out.println(MyEnumInsideTheClass.A);
    System.out.println(MyEnumOutsideTheClass.A);
    System.out.println(_Enum.A);
    
    //Forbidden !
//    enum enumInsideMethod{
//      A,B,C
//    }
  }
}

//Can declare enum outside a class, in the same file or not.
//public is not allowed for enum who is not in its own file 
//public enum MyEnumOutsideTheClass{
enum MyEnumOutsideTheClass{
  A,B,C
}
