// $Id$
package be.zatenzu.scjp.collections.map;

import java.util.AbstractMap;
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
    //This set is linked to the map, if you modify the set, the map will be too and vice versa.
    //If the map is modified during an loop on the set obtained by entrySet() --> java.util.ConcurrentModificationException
    /*for(Map.Entry<String, String> et : keys){
      if(et.getKey().equals("B")){
        myMap.put("Z", "z");
      }
    }*/
    
    //The set obtained by entrySet() doens't support add operation! -> java.lang.UnsupportedOperationException
    Map.Entry<String, String> entry = new AbstractMap.SimpleEntry<String, String>("D", "d");
    //keys.add(entry);//->java.lang.UnsupportedOperationException
    
    /** get(Object key) **/
    //get the object mapped for the key 'key'
    //if the key is not present, return null
    // WARNING: if the map type allow null value and this method return null, you don't know
    // if the key exists or not.
    myMap.get("A");
    
    /** isEmpty **/
    //return true if the map contains no key-value mapping
    myMap.isEmpty();
    
    /** keySet() **/
    //idem as entrySet but return a set with all keys
    myMap.keySet();
    //the set is backed to the original map
    
    /** put(key, value) **/
    myMap.put("G", "g");
    //associate the value with the key.
    //return the old value associate with the key
    //return null if the key wasn't in the
    
    //NPE if the map doens't allow null value or null key
    
    /** putAll(Map<>) **/
    myMap.putAll(new HashMap<String, String>());
    //add all entry to the map
    
    /** remove(Object o) **/
    myMap.remove("G");
    //remove the mapping associate with the key
    //return the value associate with the key if it exists
    //return null if the key wasn't in the map or the null value was the value
    
    /** size() **/
    //return the number of key-value mapping
    myMap.size();
    //if the number of wey value mapping is bigger than Integer.MAX than return Integer.MAX
    
    /** values() **/
    myMap.values();
    //idem than keyset but with values and not keys
  }
}
