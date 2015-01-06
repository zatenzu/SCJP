// $Id$
package be.zatenzu.scjp.keywords._byte;

public class _Byte
{
  static byte initialValue;
  
  public static void main(String[] args)
  {
    /**
     * byte is one of the 8 primitive types in Java.
    **/
    byte primitve = 1;
    
    /**
     * It use to declared a numeric variable from -128 to 127
     * (8-bit integer number -> 256 different values)
     */
    System.out.println("byte is a numric value from " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
    
    /**
     * Initial value is 0
     */
    System.out.println("Initial value is " + initialValue);
    
    /**
     * Wrapper class is Byte.
     */
    byte wrapper = new Byte((byte) -128);
    
  //numbers are always implicitly int
    byte bb = 8;
    //but
    int b = 2;
    byte b2 = (byte)b;//need casting
    
    byte bbb = 127;
    //byte bbbb = 128;//too big
    
    /**
     * From expression
     */
    byte addition = 1 + 126;
//    byte addition = 1 + 127;//too big
    byte z = 1;
    byte y = 1;
    byte result = (byte) (z+y);//expression result is int -> casting
    //byte result = (byte) z+y;//() are required.
  }
}
