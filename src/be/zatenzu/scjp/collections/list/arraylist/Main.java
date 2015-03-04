// $Id$
package be.zatenzu.scjp.collections.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Main
{
  public static void main(String[] args)
  {
    //implements interface List
    
    //typed list
    ArrayList<String> al = new ArrayList<>();
    
    ArrayList myList = new ArrayList<>();//like this or
    List myList2 = new ArrayList();//like this
    //can add any Object
//    myList.add(new Integer(2));
//    myList.add(new String("2"));
    //...
    
    ArrayList<Integer> myIntArray = new ArrayList<>();
    //augment la capacite minimal de la liste
    myIntArray.ensureCapacity(2);
    
    //trimToSize();
    //resize the list with the minimal size needed.
    myIntArray.trimToSize();
  }
}
