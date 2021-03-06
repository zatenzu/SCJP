// $Id$
package be.zatenzu.scjp.keywords._float;

public class _Float
{
  //float f = 23.23;//by default floating point numbers are double!
  //->So f or F is required
  float ff = 23.23f;
  float fff = 23.23F;
  //float ffff = 23,23F;// . but not ,
  
  /**
   * float is one of the 8 primitive types in Java.
  **/
  static float initialized;
  
  public static void main(String[] args)
  {
    /**
     * It use to declared a numeric variable from 1.4E-45 to 3.4028235E38
     * It use to declared a 32-bit floating point value.
     */
    System.out.println("float is a numric value from " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
    
    /**
     * Initial value is 0.0f
     */
    System.out.println("Initial value is " + initialized);
    
    /**
     * Wrapper class is Float.
     */
    Float wrapper = new Float(0f);//float
    wrapper = new Float(0.0);//double
    wrapper = new Float("0.0");//String
    
    /**
     * default floating point value is a double!
     */
    //float f = 0.0;//Type mismatch: cannot convert from double to float
    float f = 0.0f;//add f ou F
    f = (float)0.0;//
    
    //Zero before . is implicit
    float ff = .0f;
    
    /**
     * Exponential (positive or negative) value is allowed
     */
    float fff = 12E-1f;// E = exponent
  }
}
