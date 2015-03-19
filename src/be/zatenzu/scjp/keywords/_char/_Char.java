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
    // /!\literal integers are implicitly a int
    char a = 65;
    char fromInt = 65535;
    char fromIntt = (char)65536; //> 65535  -> casting
  //possible loss of precision
    
    /**
     * Or negative numeric
     */
    //stupid but legal with casting!
    //possible loss of precision
    char charFromNegative = (char) -98;
    
    //int or smaller expression always resulting in an int.
    //char addition =  a + a;//
    //char addition = (char) a + a;//
    char addition = (char) (a + a);//
    
    /**
     * char can be created from a single character
     */
    char aa = 'A';
    /**
     * char can be created from unicode escape sequence
     */
    char aaa = '\u0041';
    
    //from hexadecimal value
    char aaaa = 0xFFFF;//655535
    
//    char aaaaa = 0xFFFFFF;//too big but
    char aaaaa = (char)0x010021;//too big but with casting it's ok(restart from 0)
    System.out.println("aaaaa" + aaaaa);
    
    /**
     * char wrapper class is Character
     */
    new Character('\u0041');
    
    new Character((char)1);
    
    new Character((char)0xFFFF);
    
    new Character('A');
    
    /**
     * char is compatible with int
     */
    int i = aa;
  }
}
