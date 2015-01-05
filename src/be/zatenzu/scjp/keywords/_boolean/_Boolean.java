// $Id$
package be.zatenzu.scjp.keywords._boolean;

public class _Boolean
{
  static boolean initialized;
  
  public static void main(String[] args)
  {
    /**
     * boolean is one of the 8 primitive types in Java
     */
    boolean javaPrimitive = true;
    
    /**
     * The default value is 'false'
     */
    System.out.println(initialized ? "My default value is 'true'" : "My default value is 'false'");
    
    /**
     * It may take on one of the values 'true' or 'false' and nothing else!
     */
    // valid
    boolean a = true;
    boolean b = false;

    //invalid
    /*
    boolean c = 0;
    boolean d = 1;
    boolean e = True;
    boolean f = False;
    boolean g = y;
    boolean h = n;
    boolean i = yes;
    boolean j = no;
    */
    
    /**
     * A expression containing boolean operands can contain only boolean operands.
     */
    //valid
    if( (true && false) || ("same".equals("same")) ^ (!false));
    
    //invalid
    /*
     * if(true && "ok" || "same".equals("same") ^ !false);
     */
    
    //The wrapper class is Boolean
    boolean myWrapper = new Boolean(true);
    
  }
}
