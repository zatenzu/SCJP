// $Id$
package be.zatenzu.scjp.keywords._class;

/**
 * 
 * Only one public class per file
 * The file name must match with the public class name
 * A file can content more than 1 non-public class
 * A file with no public class can have a name different than class name
 *
 */
public class _Class
{
  /**
   * class keyword is used to declare class or inner class.
   */
  
  /**
   * By convention:
   * - public class must be in a specific .class file.
   * - class file should have serveral inner classes.
   * - class file name begin with upper case character
   * - If a file contains no public class, the name file can be different
   */
  
  public static void main(String[] args)
  {
    /**
     * class is a special attribut on a class.
     * On a T Class, get Class<T> instance
     */
    Class<Object> c = Object.class;
    
    
    
    System.out.println("Hello");
  }
}
//public class A{}//compilation error