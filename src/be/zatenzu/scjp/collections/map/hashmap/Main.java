// $Id$
package be.zatenzu.scjp.collections.map.hashmap;

import java.util.HashMap;

public class Main
{
  public static void main(String[] args)
  {
    //not ordered, not sorted
    HashMap<MyClass, String> hm = new HashMap<MyClass, String>();
    
    //can add null key
    hm.put(null, "It's null dude!");
    System.out.println(hm.get(null));
    
    //can add null values
    hm.put(new MyClass("Null value1"), null);
    hm.put(new MyClass("Null value2"), "Null value2");
    System.out.println(hm.size());
  }
}
