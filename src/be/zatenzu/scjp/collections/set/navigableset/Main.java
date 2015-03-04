// $Id$
package be.zatenzu.scjp.collections.set.navigableset;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main
{

  public static void main(String[] args)
  {
    NavigableSet<String> ns = new TreeSet<>();
    ns.add("Z");
    ns.add("C");
    ns.add("B");
    ns.add("H");
    ns.add("A");
    System.out.println(ns);//ABCHZ -> sorted!
    
    //ceiling(T t);
    //return the least element greater or equal to t. If it doesn't exist, return null
    System.out.println(ns.ceiling("F"));//==> H
    
    //descendingIterator()
    Iterator di = ns.descendingIterator();
    String s;
    for(;di.hasNext();){
      s = (String) di.next();
      System.out.print(s);
    }
    System.out.println();
    //===> ZHCBA
    
    //descendingSet();
    //return a reverse view set
    /*
       The result Set is linked with the initial set, if the sub set is modified, the
       original set will be too!!!

     */
    Set<String> sset = (Set<String>) ns.descendingSet();
    System.out.println(sset);
    //==> [Z, H, C, B, A]
    
    //floor(T t)
    //Return the greatest element who is less or equal to t. If it doesn't exist, return null
    System.out.println(ns.floor("G"));
    //==> C
    
    //headSet(T to, boolean inclusiveTo)
    //return a sub navigableSet with elements who are less than to, to
    //included if inclusiveTo is true
    /*
      1]
      The sub set has range to 'to'!!!!
      ==> [A,B,C,....G/]
      If we put an element greater than G ---> IllegalArgumentException!!
      
      2]
      If the initial Set is modified, the sub set wiil be too and vice-versa!!!
    */
    SortedSet<String> ss = ns.headSet("G");
    System.out.println(ss);//[A,B,C]
    
    //higher(T t)
    //return the least element greater than t or null if it doesn't exist
    System.out.println(ns.higher("G"));
    //==> H
    
    //lower(T t)
    //return the greater element who is less than T
    System.out.println(ns.lower("G"));
    //==> C
    
    //pollFirst();
    //return and remove the first element
    System.out.println(ns.pollFirst());
    //==> A
    ns.add("A");
    
    //pollLast();
    //return and remove the last element
    System.out.println(ns.pollLast());
    //Z
    ns.add("Z");
    
    //subSet(T from, boolean inclusiveFrom, T to, boolean inclusiveTo)
    //return a sub set of the set from "from" element to "to" element.
    //from element is included if inclusiveFrom is true
    //to element is included if inclusiveTo is true
    //This sub set is linked to the initial set. If the sub set is modified, the initial set will be too !!!
    //This sub set is ranged, if you add an element outside this rang --> IllegalArgumentException.
    System.out.println(ns.subSet("B", true, "L", true));
    //==> [B, C, H]
    
    //tailSet(T from, boolean inclusiveFrom);
    //return a subset included all elements greater than from (or equals if inclusiveFrom is true)
    System.out.println(ns);
    System.out.println(ns.tailSet("H", true));
    //===> [H, Z]
    /*

        1] tailSet with "H", get a ranged sub set.
        ==> [/H, Z]
        If you put an element before H --> IllegalArgumentException!
        
        2] The sub set is linked with the initial set, if the sub set is
        modified, the initial set will be too and vide-versa!
     */
  }

}
