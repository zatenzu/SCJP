// $Id$
package be.zatenzu.scjp.accessmodifier._default.a;

import be.zatenzu.scjp.accessmodifier._default.b.SubClass2;


public class SubClass1 extends MotherClass
{
  public void myMethod(){
    System.out.print(x);//ok I'm in the same package as x
    MotherClass c = new MotherClass();
    System.out.print(c.x);//ok I'm in the same package as x
    SubClass1 c1 = new SubClass1();
    System.out.print(c1.x);//ok I'm in the same package as x
    SubClass2 c2 = new SubClass2();
    System.out.print(c2.x);//ok I'm in the same package as x but not in the same package as SubClass2 
  }
}
