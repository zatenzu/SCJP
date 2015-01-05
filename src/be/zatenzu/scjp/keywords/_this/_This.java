// $Id$
package be.zatenzu.scjp.keywords._this;

public class _This
{
  public int i;
  /**
   * This keyword is a reference to the current object.
   */
  public _This(){
    this(1);//call a other constructor of this class
  }
  public _This(int i){
    //i = i; -> i instance variable is shadowed by constructor parameter -> use this keyword 
    this.i = i;
  }
}
