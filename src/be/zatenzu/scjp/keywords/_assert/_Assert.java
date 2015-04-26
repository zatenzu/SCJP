// $Id$
package be.zatenzu.scjp.keywords._assert;

public class _Assert
{
  /**
   * Assert keyword is used to verify the correctness of an invariant in the code.
   * assert + boolean expression
   * If the boolean expression is false then throw new AssertionError
   */
  
  // /!\ VM arg -> -ea or -enableassertions (enable asserts)
  // /!\ VM arg -> -da or -disableassertions (disable asserts)
  // By default it's disable
  /** You can enable/disable assertion just for a class or package **/
  //-ea be.zatenzu.scjp.keywords._assert._Assert --> enable just for this class
  //-ea be.zatenzu.scjp.keywords._assert --> enable just for this package
  //-ea be.zatenzu.scjp.keywords._assert... --> enable just for this package and its subpackages
  
  public static void main(String[] args)
  {
    assert (args.length > 0);
    assert true;
    assert false : new String("VALUE FOR ASSERTIONERROR CONSTRUCTOR!!!");
    //assert exp1 : exp2;
    //If exp1 is false, an AssertionError is build with exp2 as value, this error is thrown
    //Exp2 must return a value !!!
    
    
    // /!\ LEGAL != APPROPRIATE && LEGAL != CORRECT
    // Appropriate and correct words mean "should".
    // Is it a correct way to do that? Means: Is it legal and it should be done like that?
    
    /** Appropriate usage**/
    // Appropriate
    // - Validate private methode argument
    // - To check case that never ever supposed to happen
    
    // Unappropriate
    // - Validate commande line argument
    // - Validate public methode argument
    // - Don't use assert expression that case side effect
    
    
  }
}
