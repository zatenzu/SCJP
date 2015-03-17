// $Id$
package be.zatenzu.scjp.identifiers;

public class Identifier
{
  //identifiers could be composed by all Unicode and currency characters, plus underscore.
  /** legal **/
  public String a;
  public String _a;
  public String _a_;
  public String _;
  public String a€;
  public String €a;
  public String €a$;
  public String €a2$_;
  
  /** illegal **/
  /*
  public String #a;//#
  public String :a;//:
  public String -a;//-
  public String .f;//.
  public String 2a;//cannot start with a cipher
  public String a+;//cannot use operators
  public String strictfp;// /!\ keywords! @see keyword package
  */
  
  /** JavaBeans standards **/
  
  //GET
  //getVarName()
  // - no argument
  // - return the type of the var
  // - camel case
  // - must be public
  
  //IS
  //must be isVarName()
  // - only if the var is a boolean PRIMITIVE
  // - return a boolean PRIMITIVE
  // - camel case
  // - must be public
  
  //SET
  // - must be setVarName(vartype var)
  // - Only 1 argument with the same type as var
  // - camel case
  // - must be public
  
  //Listener
  // add/removeActionListener
  // - must start with add or remove
  // - must end with Listener
  // - must take 1 argument type of Listener
}
