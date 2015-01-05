// $Id$
package be.zatenzu.scjp.keywords._protected;

public class SubClass extends _Protected
{
  void myMethod(){
    System.out.println(myVar);//--> OK myVar is protected
    _Protected p = new _Protected();
    System.out.println(p.myVar);//--> OK myVar is protected and I'm in the same package!!
    //If I'm not in the same package than my mother class, I cannot access to protected member
    // through p.
  }
}
