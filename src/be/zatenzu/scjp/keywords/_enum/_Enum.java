// $Id$
package be.zatenzu.scjp.keywords._enum;

//Public or default package access modifier
public enum _Enum
{
  /**
   * enum extends implicitly java.lang.Enum!
   * so a enum cannot extends anything else!
   */
  A,B,C;
  
  /**
   * enum is a class so you can have constructors and methods.
   */
  _Enum(){
    
  }
  public int getInt(){
    _Enum e = A;
    //_Enum ee = new _Enum();//never can call an enum constructor
    
    return 0;
  }
}
