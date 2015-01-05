// $Id$
package be.zatenzu.scjp.accessmodifier._default.b;

import be.zatenzu.scjp.accessmodifier._default.a.MotherClass;
import be.zatenzu.scjp.accessmodifier._default.a.SubClass1;

public class SubClass2 extends MotherClass
{
  public void myMethod(){
    System.out.print(x);//I'm not in the same package as x
    MotherClass c = new MotherClass();
    System.out.print(c.x);//I'm not in the same package as x
    SubClass1 c1 = new SubClass1();
    System.out.print(c1.x);//I'm not in the same package as x
    SubClass2 c2 = new SubClass2();
    System.out.print(c2.x);//I'm not in the same package as x
  }
}
