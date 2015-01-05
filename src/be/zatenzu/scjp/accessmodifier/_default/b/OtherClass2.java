// $Id$
package be.zatenzu.scjp.accessmodifier._default.b;

import be.zatenzu.scjp.accessmodifier._default.a.MotherClass;
import be.zatenzu.scjp.accessmodifier._default.a.SubClass1;
import be.zatenzu.scjp.accessmodifier._default.b.SubClass2;

public class OtherClass2
{
  public void myMethod(){
    MotherClass c = new MotherClass();
    SubClass1 c1 = new SubClass1();
    SubClass2 c2 = new SubClass2();
    System.out.print(c.x);//I'm not in the same package as x
    System.out.print(c1.x);//I'm not in the same package as x
    System.out.print(c2.x);//I'm not in the same package as x
  }
}
