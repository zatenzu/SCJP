// $Id$
package be.zatenzu.scjp.keywords._abstract.b;

import be.zatenzu.scjp.keywords._abstract.a._Abstract;

public class Test extends _Abstract
{

  @Override
  public void myMethod()
  {
    // TODO Auto-generated method stub
  }
  
  //Test must override myMethode2 but it cannot because myMethode2 is not visible
  @Override
  void myMethod2()
  {
    // TODO Auto-generated method stub
  }
  
  
}
