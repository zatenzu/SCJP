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
  }
}
