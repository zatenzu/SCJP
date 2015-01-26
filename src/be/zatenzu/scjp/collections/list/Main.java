// $Id$
package be.zatenzu.scjp.collections.list;

import java.util.ArrayList;
import java.util.List;

public class Main
{
  public static void main(String[] args)
  {
      /*************************************/
     /**  List interface                 **/
    /*************************************/
    //extends Collection interface
    
    //- add(int index, Object o)
    //add the object at the 'index' position and push forward all element with index >=
    //index must be >= 0 and <= size()
    List<MyClass> myList = new ArrayList<MyClass>();
//    myList.add(1, "First");--> IndexOutOfBoundsException 1 > siize()
    myList.add(0, new MyClass("First"));
    myList.add(1, new MyClass("Second"));
    myList.add(2, new MyClass("Thrid"));
    myList.add(3, null);//can add null element
    myList.add(2, null);//can add null element
    
    //- add(Object o)
    // add the object at the end of the list
    myList.add(new MyClass("Second"));
        
    //-  get(int index)
    // return the object at the position 'index'
    // index must be >= 0 and <= size()
    System.out.println(myList.get(2));//Thrid
    
    //-  indexOf(Object o)
    // return the index of the first occurence object
    //based on equals method
    // return -1 if !found
    System.out.println(myList.indexOf(new MyClass("Second")));
    
    // conntains(Object o)
    //return true if list contains the object
    //base on equals method
    myList.contains(new MyClass("Second"));
    
    //- set(int index, Object o)
    // set the object o at the position 'index'
    //if an element is already defined at the position, the element is replaced
    //don't push element forward, just replace!
    myList.set(2, new MyClass("Thrid"));
    
    // clear()
    //remove all elements
    myList.clear();
    
    //isEmpty()
    //return true if size() == 0
    myList.isEmpty();
    
    List<String> mySecondList = new ArrayList<>();
    mySecondList.add(null);
    mySecondList.add(null);
    mySecondList.add(null);
    mySecondList.add(null);
    System.out.println("isEmpty:" + mySecondList.isEmpty());//false
    //only null element != empty!!!
  }
}
