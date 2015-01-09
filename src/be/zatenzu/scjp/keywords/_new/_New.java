// $Id$
package be.zatenzu.scjp.keywords._new;

public class _New
{
  /**
   * Used to create an instance of a class or array object
   */
  Object o = new Object();
  int[] tab = new int[2];
  
  /** What happends during new ?**/
  //- All instance variables are assigned default values
  //- The constructor is invoked and the super constructor too etc...
  //- All super constructors complete
  //- Instance variables that are initialized as part of their declaration are assigned
  //their initial value.
  //- The constructor completes
}
