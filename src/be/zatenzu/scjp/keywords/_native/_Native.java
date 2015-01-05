// $Id$
package be.zatenzu.scjp.keywords._native;


/** public native class _Native -> Forbidden**/
public class _Native
{
//  protected native int a;//forbidden
  
  /** It marks a method, that it will be implemented in other languages, not in Java.
   * See JNI.
   */
  public native boolean isJavaCode();
  
  // /!\ Only on methods!!!
}
