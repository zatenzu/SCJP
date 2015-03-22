// $Id$
package be.zatenzu.scjp.keywords._short;

public class _Short
{
  /**
   * int is 1 of the 8 primitive type
   */
  static int initialValue;
  
  public static void main(String[] args)
  {
    /**
     * It use to declared a 16-bit signed integer.
     * Minimal value is -32 768 
     * Maximal value is 32 767
     */
    System.out.println("short is a numric value from " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
    
    /**
     * Initial value is 0
     */
    System.out.println("Initial value is " + initialValue);
    
    short s1 = '\u0000';
    s1 = 'A';
    s1 = (short)0xFFFF;//need casting from hexa :/
    
    /**
     * Wrapper class is Short.
     */
    Short wrapper = new Short((short)1); //casting is required because default numeric value is integer
    wrapper = new Short((short)1);//short
    wrapper = new Short("1");//string
    wrapper = new Short((short)0xFFFF);//hexa
  }
}
