// $Id$
package be.zatenzu.scjp.keywords._class;

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
  
  /**
   * class is a special attribut on a class.
   * On a T Class, get Class<T> instance
   */
  Class<Object> c = Object.class;
  public static void main(String[] args)
  {
    System.out.println("Hello");
  }
}
//public class A{}//compilation error