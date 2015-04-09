// $Id$
package be.zatenzu.scjp.keywords._enum;

public class MyOtherClass
{
  static _Enum a;
  public static void main(String... args)
  {
//    _Enum a;
    
    //MyEnumInsideTheClass is unknown, must though over MyClass
//    System.out.println(MyEnumInsideTheClass.A);
    //System.out.println(new MyClass().MyEnumInsideTheClass.A);
    System.out.println(MyClass.MyEnumInsideTheClass.A);
    System.out.println(MyEnumOutsideTheClass.A);
    System.out.println(_Enum.A);
    System.out.println(a.B.A.C);
    
    /** ordinal() **/
    //give the index of the constant
    System.out.println(a.B.ordinal());
    
    /** values **/
    //return an array with all enum values
    System.out.println(_Enum.values());//_Enum[]! Not an Iterator
    
    /** compareTo() **/
    //java.lang.Enum implements Comparable!
    System.out.println(a.compareTo(a.A));
    
    /** name() **/
    //give the name of the constant
    System.out.println(a.name());
  }
}
