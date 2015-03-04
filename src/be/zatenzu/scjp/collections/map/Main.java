// $Id$
package be.zatenzu.scjp.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main
{
  public static void main(String[] args)
  {
    Map<String, String> myMap = new HashMap<String, String>();
    myMap.put("A","a");
    myMap.put("B","b");
    myMap.put("C","c");
    
    /** clear() **/
    //makes the map empty
    myMap.clear();
    myMap.put("A","a");
    myMap.put("B","b");
    myMap.put("C","c");
    
    /** containsKey(Object o) **/
    //return true if o is a key of the map (based on equals)
    System.out.println(myMap.containsKey("A"));
    
    /** containsValue(Object o) **/
    //return true if the map contains a value equals to o
    System.out.println(myMap.containsValue("c"));
    
    /** entrySet() **/
    //return a set with all key-value pair in the map
    Set<Map.Entry<String,String>> keys = myMap.entrySet();
  }
}
