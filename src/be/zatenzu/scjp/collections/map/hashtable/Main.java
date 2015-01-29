// $Id$
package be.zatenzu.scjp.collections.map.hashtable;

import java.util.Hashtable;

public class Main
{
  public static void main(String[] args)
  {
    //same as HashMap but thread safe
    //Not allow null as key of value!!!! --> NullPointerException
    Hashtable<String, String> ht = new Hashtable<String, String>();
    
    ht.put(null, null);
  }
}
