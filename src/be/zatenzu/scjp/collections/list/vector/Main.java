// $Id$
package be.zatenzu.scjp.collections.list.vector;

import java.util.Enumeration;
import java.util.Vector;

public class Main
{
  public static void main(String[] args)
  {
    //Same thing as ArrayList but synchronized
    
    Vector<String> stringVector = new Vector<String>();
    
    
    /** addElement() **/
    //This method is identical to add but synchronized
    stringVector.addElement("First");
    
    /** capacity() **/
    //return the capacity of the vector
    // (not the size but the capacity of the internal array
    System.out.println(stringVector.capacity());//10
    System.out.println(stringVector.size());//1
    
    /** copyInto(Object[] array) **/
    //copy the content of the vector to the array.
    //if the array is too small --> ArrayindexOfOutBoundsException
//    stringVector.addElement("Second");
    Object[] objArray = new Object[1];
    stringVector.copyInto(objArray);
    for(int i = 0; i < objArray.length; i++){
      System.out.println(objArray[i]);
    }
    
    /** elementAt() **/
    //This method is identical to get buy scynchro
    System.out.println(stringVector.elementAt(0));
    //if the index is out of range --> java.lang.ArrayIndexOutOfBoundsException
    
    /** elements() **/
    //get an enumeration with the content of the vector
    //the first element at the first position etc ..
    Enumeration<String> enumStrings = stringVector.elements();
    
    /** ensureCapacity(int i) **/
    //@see ArrayList
    
    /** firstElement() **/
    //return the element at 0 index
    System.out.println(stringVector.firstElement());
    
    /** indexOf(Object o, int i) **/
    //search for the specified element starting at i
    //based on equals method
    stringVector.indexOf("First", 1);
    
    
    /** insertElementAt(T t, int index) **/
    //same as add(T t, int i)
    stringVector.insertElementAt("Second", 1);
    
    /** lastElement() **/
    //return the last element of the vector
    //if the vector is empty -> NoSuchElementException
    stringVector.lastElement();
    
    /** lastIndexOf(Object o, int i) **/
    //return the index of the last occurence of the specified object    
    stringVector.lastIndexOf("First", 1);
    
    /** removeAllElements() **/
    //remove all elements and set its size to 0
    //@see clear()
    stringVector.removeAllElements();
    
    /** removeElement(Object o) **/
    //remove trh efirst occurence of the object
    //@see remove()
    stringVector.removeElement("First");
    
    /** removeElementAt(int i) **/
    //remove the element at the specified position
    //@see remove(int i)
    stringVector.removeElementAt(1);
    
    /** setSize(int i) **/
    //set the size of the vector.
    //if the new size is greater than the current size, null value will be added at the end of the vector.
    //if the new siez is lower than the current size, all element outside the new size are discared
    stringVector.setSize(0);
    
    /** trimToSize() **/
    stringVector.trimToSize();
  }
}
