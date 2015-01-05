// $Id$
package be.zatenzu.scjp.keywords._char;

public class _Char
{
  /**
   * char is one of the 8 primitive types in Java
   */
  static char initialized;
  
  public static void main(String[] args)
  {
    /**
     * char is a 16 bits variable
     * Minimal value is 0 ('\u0000') -> null character
     * Maximal value is (2^16)-1 ('\uFFFF') -> noncharacter
     */
    System.out.println("char minimal value is " + Character.MIN_VALUE);
    System.out.println("char maximal value is " + Character.MAX_VALUE);
    
    /**
     * Default value is '\u0000' -> null character
     */
    System.out.println("char default value is " + initialized);
    
    /**
     * char can be created from numeric
     */
    char a = 65;
    /**
     * char can be created from a single character
     */
    char aa = 'A';
    /**
     * char can be created from unicode escape sequence
     */
    char aaa = '\u0041';
    
    /**
     * char wrapper class is Character
     */
    char wrapper = new Character('\u0041');
    
    /**
     * char is compatible with int
     */
    int i = wrapper;
  }
}
