// $Id$
package be.zatenzu.scjp.collections.set.linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Main
{
  public static void main(String[] args)
  {
    //ordered set!
    LinkedHashSet<MyClass> lhs = new LinkedHashSet<>();
    
    MyClass m = new MyClass("Hello");
    MyClass m2 = new MyClass("World");
    MyClass m3 = new MyClass("World");
    
    System.out.println(lhs.add(m));
    System.out.println(lhs.add(m2));
    System.out.println(lhs.add(m3));
    for(Iterator<MyClass> i = lhs.iterator() ; i.hasNext() ; ){
      System.out.println(i.next().s);
    }
    
    // /!\ REDEFINE HASHCODE() !!!!
  }
}
