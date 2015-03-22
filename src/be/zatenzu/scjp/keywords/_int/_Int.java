// $Id$
package be.zatenzu.scjp.keywords._int;

public class _Int
{
  /**
   * int is 1 of the 8 primitive type
   */
  static int initialValue;
  
  public static void main(String[] args)
  {
    int literalInteger = 7;//literal integers are implicitly a int.
    
    int base10 = 17;// = Decimal 17
    int base8 = 021;// = Octal 17
    int base16 = 0x00000011;// Hexadecimal 17
    /**
     * It use to declared a 32-bit signed integer.
     * Minimal value is -2^31 (-2147483648)
     * Maximal value is 2^31-1 (2147483647)
     */
    System.out.println("int is a numric value from " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
    
    /**
     * Initial value is 0
     */
    System.out.println("Initial value is " + initialValue);
    
    /**
     * Wrapper class is Integer.
     */
    Integer wrapper = new Integer(1);//int
    wrapper = new Integer("1");//string
//    wrapper = new Integer("0xFFFF");//NFE!
    new Integer(0xFFFF);
    
    
    /**
     *  /!\ Java 8 -> Can be use for unsigned 32-bit integer
     *  See java 8.
     */
    
    /** int is compatiable with char **/
    int a = 'c';
    char c = (char)a;
    
    /** int is compatiable with float **/
    float f = a;
    f = 23.24F;
    a = (int)f;//keep only 23
    System.out.println(a);
  }
}
