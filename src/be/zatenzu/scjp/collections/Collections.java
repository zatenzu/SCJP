// $Id$
package be.zatenzu.scjp.collections;

import java.util.ArrayList;
import java.util.List;

public class Collections
{
  public static void main(String[] args)
  {
    //sort()
    //sort a collection
    List<String> stringList = new ArrayList();
    stringList.add("E");
    stringList.add("F");
    stringList.add("H");
    stringList.add("A");
    System.out.println("Unsorted:" + stringList);
    java.util.Collections.sort(stringList);
    System.out.println("Sorted:" + stringList);
    
    //if collection is typed, the type must implements Comparable interface!!
    //==> compilation error
    List<Object> objectList = new ArrayList();
    objectList.add(new Object());
    objectList.add(new Object());
//    java.util.Collections.sort(objectList);//compilation error
    
    
    //Interface Comparable ---> compareTo()
    // < 0 --> lower as
    // 0 --> same as
    // > 0 --> higher as
  }
}
