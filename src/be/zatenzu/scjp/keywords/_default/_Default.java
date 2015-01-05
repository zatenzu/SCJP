// $Id$
package be.zatenzu.scjp.keywords._default;

public class _Default
{
  public static void main(String[] args)
  {
    /**
     * default keyword can optionally be used in a switch statement to label a
     * block of statements to be executed if no case matches the specified value
     */
    int i = 3;
    switch (i)
    {
      case 0:
        break;
      case 1:
        break;
      case 2:
        break;
      default:
    }
  }
  
  /**
   * default keyword can be used in annotation to specify
   * the default value
   *
   */
  public @interface MyAnnotation
  {
    String myVar1() default "";
    String[] myVar2();
    String myVar3();
  }
  
  
  /**
   * default keyword can be used in interface to define the default method implementation
   * ==> see JAVA 8!!!!
   */
  
}
