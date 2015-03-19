// $Id$
package be.zatenzu.scjp.keywords._long;

public class _Long
{
  /**
   * long is 1 of the 8 primitive type
   */
  static long initialValue;
  
  public static void main(String[] args)
  {
    long base10 = 17l;//or 17L = Decimal 17
    long base8 = 021l;//or 021L = Octal 17
    long base16 = 0x00000011l;//0x00000011L  Hexadecimal 17
    
    // default numeric value is an int!!!!
//    long a = 9223372036854775807;
    // add L or l
    long b = 9223372036854775807L;
    /**
     * It use to declared a 64-bit signed integer.
     * Minimal value is -2^63 (-9223372036854775808)
     * Maximal value is 2^63-1 (9223372036854775807)
     */
    System.out.println("long is a numric value from " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
    
    /**
     * Initial value is 0
     */
    System.out.println("Initial value is " + initialValue);
    
    /**
     * Wrapper class is Long.
     */
    Long wrapper = new Long(1l);//long
    new Long("1");//string
//    new Long("1L");//NumberFOrmatException
    
    wrapper = 1L;
//    wrapper = 1;// Frobbiden requiered L or l!!!!
    long lon = 1;//OK
    /**
     *  /!\ Java 8 -> Can be use for unsigned 64-bit integer
     *  See java 8.
     */
  }
}
