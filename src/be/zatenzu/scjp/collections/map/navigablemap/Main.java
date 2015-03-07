// $Id$
package be.zatenzu.scjp.collections.map.navigablemap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

public class Main
{

  public static void main(String[] args)
  {
    NavigableMap<String, String> myNavigableMap = new TreeMap<String, String>();
    //myNavigableMap.put("B", "b");
    myNavigableMap.put("A", "a");
    myNavigableMap.put("C", "c");
    myNavigableMap.put("G", "g");
    myNavigableMap.put("T", "t");
    
    /** ceilingEntry(T key); ceiling = plafond **/
    //return the entry equals to 'key' or the entry mapping with a key just greater than 'key' 
    Map.Entry<String, String> entry = myNavigableMap.ceilingEntry("B");
    System.out.println(entry.getKey());
    
    /** ceilingKey(T key) **/
    //return the key equals to 'key' or the entry mapping with a key just greater than 'key'
    System.out.println(myNavigableMap.ceilingKey("B"));
    
    /** descendingKeySet() **/
    //return a set with all keys in desc order
    Set<String> descKeys = myNavigableMap.descendingKeySet();
    for(String k : descKeys){
      System.out.println(k);
    }
    //TGCA
    //the Set is backed by the map
    
    /** descendingMap() **/
    //return the map ordered desc
    NavigableMap<String, String> descNavigableMap = myNavigableMap.descendingMap();
    //the map is backed by the map
    
    /** firstEntry **/
    //return the first entry associate with the least key or null if the map is empty
    Map.Entry<String, String> et = myNavigableMap.firstEntry();
    
    /** floorEntry(T t) **/
    //return the entry mapped with the greater less or equals to key than 't'
    et = myNavigableMap.floorEntry("C");
    System.out.println(et.getKey());
    
    /** floorKey(T key) **/
    //return the greater less than or equals key to 'key'
    myNavigableMap.floorKey("C");
    
    /** higherEntry(T k) **/
    //return the entry mapped with the least key stricly greater than 'k'
    myNavigableMap.higherEntry("C");
    
    /** higherKey(String k); **/
    //return the key mapped with the least key stricly greater than 'k'
    myNavigableMap.higherKey("C");
    
    /** lastEntry() **/
    //return the entry mapped with the greatest key of the map
    myNavigableMap.lastEntry();
    
    /** lowerEntry(T key) **/
    //return an entry with the greatest key strictly less than 'key'  
    myNavigableMap.lowerEntry("C");
    
    /** lowerKey(T key) **/
    //return the greatest key strictly less than 'key'
    myNavigableMap.lowerKey("C");
    
    /** navigableKeySet **/
    //return a navigableSet with keys of the map.
    //the set is backed by the map.
    //the set doesn't support operation add operations
    NavigableSet<String> nks = myNavigableMap.navigableKeySet();
    
    /** pollFirstEntry() **/
    //removes and returns an entry with the first key of the map
    myNavigableMap.pollFirstEntry();
    
    
    /** pollLastEntry() **/
    //removes and returns an entry with the last key of the map
    myNavigableMap.pollLastEntry();
  }

}
