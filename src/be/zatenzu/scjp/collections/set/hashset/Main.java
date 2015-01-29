// $Id$
package be.zatenzu.scjp.collections.set.hashset;

import java.util.HashSet;

public class Main
{
  public static void main(String[] args)
  {
    //extends Set
    //use equals and hashCode
    //Not sorted, not ordered
    HashSet<String> hs = new HashSet<String>();
    
    //add();
    //add the element to the list if the element is not already in the list
    //return true if the element was added
    System.out.println(hs.add("String"));//true
    System.out.println(hs.add("String"));//false
    System.out.println(hs.size());
    
    
    // /!\ REDEFINE HASHCODE() !!!!
  }
}
