// $Id$
package be.zatenzu.scjp.collections.set.sortedset;

import java.util.SortedSet;
import java.util.TreeSet;

public class Main
{

  public static void main(String[] args)
  {
    SortedSet<String> ss = new TreeSet<String>();
    ss.add("B");
    ss.add("F");
    ss.add("A");
    ss.add("J");
    System.out.println(ss);//[A, B, F, J]
    
    //first
    //return the first (the lower) element
    //If the set is empty --> NoSuchResultException !!!!
    System.out.println(ss.first());//A
    
    //headSet(T t)
    /*
      return a SortedSet with elements who are less than t, t included
      the sub set is linked to the initial set so if you modify the sub set,
      the initial set will be too and vice-versa!!
     */
    SortedSet<String> headedSet = ss.headSet("G");
    System.out.println(headedSet);//[A, B, F]
    //the returned set is ranged to J. If you try to add an element geater than J --> IllegalArgumentException
//    headedSet.add("H");//Exception in thread "main" java.lang.IllegalArgumentException: key out of range
    
    //last
    //return the last(the greater element)
    System.out.println(ss.last());
    //==> J
    
    
    //subSet(T from, T to)
    //return a set included all elements from 'from'(inclusive) to 'to' (exclusive) 
    //throw IllegalArgumentException if from is greater than to
    System.out.println(ss.subSet("F", "Y"));
    //=>[F, J]
    /*
       The returned set is ranged!!! If you add an element outside this range --> IllegalAgumentException.
       
       The returned set is linked to the inital set. If you modify the sub set, the initial set will be too
       and vice-versa.

     */
        
    /*
    tailSet(T fromElement)
    return a sub set with greater or equal elements than fromElement included.
    the sub set is linked to the initial set so if you modify the sub set,
    the initial set will be too and vice-versa!!
    */
    SortedSet<String> subSs = ss.tailSet("J");
    System.out.println(subSs);
    //==> [J]
    //the returned set is ranged to J. If you try to add an element low than J --> IllegalArgumentException
    //subSs.add("H");//--->Exception in thread "main" java.lang.IllegalArgumentException: key out of range
  }

}
