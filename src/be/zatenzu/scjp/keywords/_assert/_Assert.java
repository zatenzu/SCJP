// $Id$
package be.zatenzu.scjp.keywords._assert;

public class _Assert
{
  /**
   * Assert keyword is used to verify the correctness of an invariant in the code.
   * assert + boolean expression
   * If the boolean expression is false then throw new AssertionError
   */
  
  // /!\ VM arg -> -ea (enable asserts)
  
  public static void main(String[] args)
  {
    assert (args.length > 0);
  }
}
