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
}
