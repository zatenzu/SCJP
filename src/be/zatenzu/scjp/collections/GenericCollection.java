// $Id$
package be.zatenzu.scjp.collections;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GenericCollection
{
  public static void main(String[] args)
  {
    List myNoTypedList = new ArrayList();
    // samething as List<Object> myNoTypedList = new ArrayList<Object>();
    
    /** the type of the var must the same as the object list type **/
    List<Exception> myTypedList = new ArrayList<Exception>(); //OK
//    List<Throwable> myTypedList = new ArrayList<Exception>(); //NOK
//    List<Object> myTypedList = new ArrayList<Exception>(); // Object NOK
    //but it works with arrays:
    Throwable[] throwables = new Exception[2];
    
    //Doesn't work with super type
//    myStaticMethod2(myTypedList);
    //but works with arrays
    
    /**
     * You can add an object with a different type as the type of the list
     * if you use the untyped form of the list to do that.
     * 
     */
    List<Integer> list = new ArrayList<Integer>();
    myStaticMethod(list);
    list.add(new Integer(2));
    if(list.get(0) instanceof Integer){
      System.out.println("OK");
    }
    else{
      System.out.println("Ho my godness! There is a String in my Integer list!!");
    }
  }
  
  public static void myStaticMethod(List myList){
    myList.add(new String("1")); //it works, amazing!
  }
  
  public static void myStaticMethod2(List<Throwable> myList){
    myList.add(new Exception());
  }  
  
  /**
   * Collections with wild cards (?)
   */
  /** ? extends **/
  //This variable can be assigned to a collection that type is
  //Throwable or every type who extends Throwable
  List<? extends Throwable> myListExtendsType = new ArrayList<Exception>();
  //use extends for interface too!
  List<? extends Serializable> myListExtendsType2;
  //can't be used during creation of new instance!
//  List<? extends Throwable> myListExtendsType9 = new ArrayList<? extends Throwable>();//NOK
  
  public static void myStaticMethod3(List<? extends Throwable> myList){
//  myList.add(new Exception());//NOK!
//  myList.add(new Throwable());//NOK!
  }
  
  /** ? super **/
  //This variable can be assigned to a collection that type is
  //Throwable or a super type of Throwable
  List<? super Exception> myListExtendsType3 = new ArrayList<Throwable>();

  
  public static void myStaticMethod4(List<? super Exception> myList){
//    myList.add(new Throwable());//NOK
    myList.add(new Exception());//OK
  }

  public static void myStaticMethod5(List<? super Throwable> myList){
    myList.add(new Throwable());//OK
    myList.add(new Exception());//OK
  }
  
  /** ? **/
  // <?> != <Object>
  //means any type of
  List<?> myAnyTypeOfList = new ArrayList<Exception>();
  List<?> myAnyTypeOfList2 = new ArrayList<Throwable>();
  List<?> myAnyTypeOfList3 = new ArrayList<Object>();
  List<Object> myAnyTypeOfList4 = new ArrayList<Object>();
//  List<Object> myAnyTypeOfList5 = new ArrayList<Exception>();//NOK
  
  public static void myStaticMethod6(List<?> myList){
//    myList.add(new Throwable());//NOK
//    myList.add(new Exception());//NOK
//    myList.add(new Object());//NOK
  }
  
  
}
