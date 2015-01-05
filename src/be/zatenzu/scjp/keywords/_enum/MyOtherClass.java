// $Id$
package be.zatenzu.scjp.keywords._enum;

public class MyOtherClass
{
  
  public static void main(String[] args)
  {
    //MyEnumInsideTheClass is unknown, must though over MyClass
//    System.out.println(MyEnumInsideTheClass.A);
    System.out.println(MyClass.MyEnumInsideTheClass.A);
    System.out.println(MyEnumOutsideTheClass.A);
    System.out.println(_Enum.A);
  }
}
