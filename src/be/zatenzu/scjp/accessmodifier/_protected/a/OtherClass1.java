// $Id$
package be.zatenzu.scjp.accessmodifier._protected.a;

import be.zatenzu.scjp.accessmodifier._protected.b.SubClass2;

public class OtherClass1
{
  public void myMethod(){
    MotherClass c = new MotherClass();
    SubClass1 c1 = new SubClass1();
    SubClass2 c2 = new SubClass2();
    System.out.print(c.x);//ok I'm in the same package as x
    System.out.print(c1.x);//ok I'm in the same package as x
    System.out.print(c2.x);//ok I'm in the same package as x
//    System.out.print(x);
  }
}
