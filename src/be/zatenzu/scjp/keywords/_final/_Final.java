// $Id$
package be.zatenzu.scjp.keywords._final;

import java.util.ArrayList;
import java.util.List;


/**
 * the final keyword is used in several different contexts to define an entity which cannot later be changed.
 *
 */
public final class _Final extends Class1 //extends MyFinalClass --> Forbidden!!!
{
  //Cannot extends a final class. If you do that -> compiler error !!!
  
  //A instance variable who isn't defined at the declaration point is called 'blank final' variable
  //must be initialized in each constructors
  final boolean myVar;
  //A static 'blank final' instance variable must be initialized in the static bloc code where it is declared
  static final boolean myVarBis = true;
  /*
   Or
   
  static final boolean myVarBis;
  static{myVarBis = true;}
  */
  public _Final(){
    /**
     * Final variable can initialized in a constructor 
     */
    myVar = false;
    
    /**
     * Final variable can be only initialized one time.
     */
    //myVar = true; //forbidden
  }
  
  /**
   * myVar must be initialized in each constructor
   */
  //public _Final(boolean b){} //forbidden
  
  /*
   * On a method parameter
   */
  public void myMethodWithFinalParameter(final List<String> myFinalList){
    myFinalList.add("new String");// OK because the array content value is modified, not the reference
    //myFinalList = new ArrayList<String>(); forbidden, the reference is modified
  }
  
  public void myMethodAB(final Class1 class1){
    class1.x = 2;//modify the instance
//    class1 = new Class1();//cannot creat new instance
  }
  
  /**
   * Final class, the class can't be a super class.
   * extends Object -> OK
   * extends _Final -> !OK (_Final is a final class)
   */
  
  /**
   * Final method, the method cannot be overriden or hidden(like override by with static methods) by subclasses.
   */
  @Override
  public void myMethod(int a)
  {
    //final for a method parameter isn't a part of the method signature
    return;
  }
  
  /*Forbidden !!!
   * A final method cannot be Override
  
  @Override
  public void myFinalMethod()
  {
    return;
  }
   */

  public static void main(String[] args)
  {
    /**
     * Final primitive variable become a constant variable
     * This is the only one nonaccess modifier that can apply on a local variable!
     */
    final boolean theTruth = true;
    //theTruth = false; //forbidden
    
    /**
     * Final non primitive variable become a constant reference
     */
    final int[] myTab = {1,2,3};
    myTab[2] = 4;// OK because the array content value is modified, not the reference
    //myTab = {3,2,1};// forbidden, the reference is modified
    
    //final and anonymous inner class
    final String s = new String("myString");
    
    new Runnable(){
      @Override
      public void run()
      {
        //s can be used here because it's a final variable
        System.out.println(s);
      }
    };
  }
}
