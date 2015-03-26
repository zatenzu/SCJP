// $Id$
package be.zatenzu.scjp.keywords._enum;

import java.io.Serializable;

//Public or default package access modifier(if the enum isn't in a class)
public enum _Enum implements Serializable//can implements interface
{
  /**
   * enum extends implicitly java.lang.Enum!
   * so a enum cannot extends anything else!
   */
  A,B,C;
  
  /**
   * enum is a class so you can have constructors and methods.
   */
  /* private only, implicit*/_Enum(){
    
  }
  public int getInt(){
    _Enum e = A;
    //_Enum ee = new _Enum();//never can call an enum constructor
    
    return 0;
  }
}
