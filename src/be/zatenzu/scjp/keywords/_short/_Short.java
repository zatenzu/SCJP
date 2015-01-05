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
    
    /**
     * Wrapper class is Short.
     */
    short wrapper = new Short((short)1); //casting is required because default numeric value is integer
  }
}
