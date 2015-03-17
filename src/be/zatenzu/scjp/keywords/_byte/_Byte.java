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
    Byte wrapper = new Byte((byte) -128);
//    Byte wrapper2 = new Byte(127);//casting required
    
  //numbers are always implicitly int
    byte bb = 8;
    //but
    //from int
    int b = 2;
    byte b2 = (byte)b;//need casting
    
    //from char
    char c = 2;
    b2 = (byte)c;//need casting
    
    //from long
    long l = 3;
    b2 = (byte)l;//need casting
    
    byte bbb = 127;
//    byte bbbb = 128;//too big, compilation error
    //but
    byte bbbb = (byte)130;//-126 (change the sign bit and put all others to 0)
    
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
