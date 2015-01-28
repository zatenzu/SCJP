// $Id$
package be.zatenzu.scjp.collections.list.linkedlist;

import java.util.LinkedList;

public class Main
{
  public static void main(String[] args)
  {
    //implements List and Queue interface
    LinkedList<String> ll = new LinkedList<>();
    ll.add("element");
    ll.add("element");
    
    //addFirst()
    //add element at the first place
    ll.addFirst("First");
    System.out.println("addFirst:" + ll);
    
    //addLast()
    //add element at the end
    ll.addLast("Last");
    System.out.println("addLast:" + ll);
    
    //getFirst()
    //get the first element of the list
    //Don't remove the element
    System.out.println(ll.getFirst());

    //getLast()
    //get the last element of the list
    //Don't remove the element
    System.out.println(ll.getLast());
   
    //get and remove the first element
    System.out.println(ll.pop());
    
    //add first
    ll.push("First");
    System.out.println(ll);
  }
}
