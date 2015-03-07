// $Id$
package be.zatenzu.scjp.collections.map.sortedmap;

import java.util.SortedMap;
import java.util.TreeMap;

public class Main
{

  public static void main(String[] args)
  {
    SortedMap<String, String> sortedMap = new TreeMap<String, String>();
    sortedMap.put("C", "c");
    sortedMap.put("A", "a");
    sortedMap.put("F", "f");
    sortedMap.put("B", "b");
    
    for(String key : sortedMap.keySet()){
      System.out.println(key);
    }
    
    /** comparator() **/
    //return the comparator used to sort the map
    System.out.println(sortedMap.comparator());
    //return null if the map used the natural ordering
    
    /** firstKey **/
    //return the first key of the map (lowest)
    sortedMap.firstKey();
    //throw NoSuchElementException if th emap is empty
    
    /** headMap(T to) **/
    //return a map with key value mapping to the key 'to' 
    sortedMap.headMap("C");
    //the returned map is backed by the original map!
    //the returned map is ranged to 'to' key --> IllegalArgumentException
    
    /** lastKey() **/
    //return the last key of the map (highest)
    sortedMap.lastKey();
    
    /** subMap(T fromKey, T toKey) **/
    //return a sortedMap with all key-value entries from fromKey (inclusive) to toKey (exclusive)
    sortedMap.subMap("fromKey", "toKey");
    //the returned map is backed by the original map
    //the returned map is ranged from fromKey (inclusive) to toKey (exclusive)
    
    /** tailMap(T key); **/
    //return a map whose keys are greater or equal to 'key'
    sortedMap.tailMap("B");
    //the returned map is backed to the original map
    //the return map is ranged from key
  }

}
