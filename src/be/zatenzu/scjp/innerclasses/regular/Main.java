// $Id$
package be.zatenzu.scjp.innerclasses.regular;

import be.zatenzu.scjp.innerclasses.regular.OutClass.MyRegularInnerClass;

public class Main
{
  public static void main(String[] args)
  {
    //To create an instance of an regular inner class
    //You MUST pass by a instance of the outclass (if you are outside the outclass)
    OutClass.MyRegularInnerClass mric = new OutClass().new MyRegularInnerClass();
    //or
    OutClass outClass = new OutClass();
    OutClass.MyRegularInnerClass mric2 = outClass.new MyRegularInnerClass();
  }
}
