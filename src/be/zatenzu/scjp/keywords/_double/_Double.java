// $Id$
package be.zatenzu.scjp.keywords._double;

public class _Double
{
  double d = 23.23;//by default floating point numbers are double!
  double dd = 23.23D;//D is implicit
  double ddd = 23.23d;//d is implicit
  double dddd = .23d;//0 is implicit
  /**
   * char is one of the 8 primitive types in Java
   */
  static double initialized;
  
  public static void main(String[] args)
  {
    /**
     * It use to declared a 64-bit floating point value.
     * Minimal value is 4.9E-324
     * Maximal value is 1.7e+038
     */
    System.out.println("double is a floating point number value from " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
    
    /**
     * The default value is 0.0d
     */
    System.out.println("double default value is " + initialized);
    
    /**
     * The double wrapper class is Double
     */
    Double d = new Double(0);//double
    d = new Double("0");//String
    
    /**
     * Exponential (positive or negative) value is allowed
     */
    double fff = 12E-1;// E = exponent
    
    /**
     * Zero before dot is implicit
     */
    double dd = .0;
  }
}
