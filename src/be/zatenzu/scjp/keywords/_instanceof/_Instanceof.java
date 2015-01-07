// $Id$
package be.zatenzu.scjp.keywords._instanceof;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;

import javax.management.relation.RoleList;

public class _Instanceof
{
  public static void main(String[] args)
  {
    Object list = new ArrayList<>();
    
    if(list instanceof Object){
      System.out.println("Yes, it's an Object!");
    }
    if(list instanceof Iterable){
      System.out.println("Yes, it's an Iterable!");
    }
    if(list instanceof Serializable){
      System.out.println("Yes, it's a Serializable!");
    }
    if(list instanceof Cloneable){
      System.out.println("Yes, it's a Cloneable!");
    }
    if(list instanceof AbstractList){
      System.out.println("Yes, it's an AbstractList!");
    }
    if(list instanceof AbstractCollection){
      System.out.println("Yes, it's an AbstractCollection!");
    }
    if(list instanceof Runnable){
      System.out.println("Yes, it's a Runnable!");
    }
    if(list instanceof String){
      System.out.println("Yes, it's a String!");
    }
    
    // instanceof can be used with null
    if(null instanceof Object){System.out.println("null");}
    //-> always false
    
    String s = ";";
//    if(s instanceof Exception){}//Compilator error
    
    int[] tab = {1,2,3};
    if(tab instanceof Object){System.out.println("Arrays are Object!");}
    
    /**
     * Resume table at page 298
     */
  }
}
