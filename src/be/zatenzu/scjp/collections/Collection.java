// $Id$
package be.zatenzu.scjp.collections;

import java.util.ArrayList;

public class Collection
{
  public static void main(String[] args)
  {
    java.util.Collection<String> collection = new ArrayList<>();

    /**add(T t)*/
    //add t to the collection
    //return true if the collection is modified by the call.
    collection.add("Hello");
    System.out.println(collection);
    /*
     * can throw:
     *  - UnsupportedOperationException: If the add method isn't supported by the collection.
     *  ==> see Collections.unmodifiableCollection(Collection collection)
     *  
     *  - ClassCastException
     *  - NPE: if the collection doesn't allow you to add null value.
     *  - IllegalArgumentException
     *  - IllegalStateException
     */
    
    /**addAll(Collection<? exetends typedCollection> collection)*/
    //add all value in the collection to this collection.
    //return true if the collection is modified by the method call.
    java.util.Collection<String> collectionToAdd = new ArrayList<>();
    collectionToAdd.add("I");
    collectionToAdd.add(" ");
    collectionToAdd.add("am");
    collectionToAdd.add(" ");
    collectionToAdd.add("Thomas");
    collection.addAll(collectionToAdd);
    System.out.println(collection);
    /*
     * 
     * Throw: see add()
     * 
     */
    
    /** clear() */
    //remove all value in the collection
    collection.clear();
    System.out.println(collection);
    /*
     * Throw UnsupportedException
     */
    
    /** contains(T t) */
    //return true if the collection contains at least the value
    //based on o==null ? e==null : o.equals(e)
    collection.add("Hello");
    System.out.println(collection.contains("Hello"));
    
    /** containsAll */
    //return true if the collection contains all value in the collection
    System.out.println(collection.containsAll(collectionToAdd));
    
    /** isEmpty */
    //return true if the collection content no element
    collection.clear();
    collection.add(null);
    System.out.println(collection.isEmpty());
    //
    // IF THE COLLECTION CONTENT NULL VALUE, return false!!
    
    /** remove(T t) */
    // remove the specified value
    //return true if the element is removed
    collection.add(null);
    System.out.println(collection.remove(null));
    System.out.println(collection.isEmpty());
    /*
     * 
     * If the collection contains more than one the value, remove only one!
     * 
     */
    
    /** removeAll(Collecton c) */
    //remove all element in the collection
    //return true if the collection is modified by the methode call.
    collection.removeAll(collectionToAdd);
    
    /** retainAll(Collection collection) */
    //keep all value who are present in the collection.
    //return true if the collection is modified by the methode call
    collection.retainAll(collectionToAdd);
    
    /** size();*/
    //return the number of element present in the collection
    System.out.println(collection.size());
    //
    // if the collection contains more than Integer.MAX_VALUE, return Integer.MAX_VALUE !!!
    //
    
    /** toArray() */
    //return an array with all element in the collection
    collection.add("H");
    collection.add("E");
    collection.add("L");
    collection.add("L");
    collection.add("O");
    System.out.println(collection);
    
    Object[] myArrayFromCollection = collection.toArray();
    
    /**
        String[] myArrayFromCollection2 = (String[])collection.toArray();
        ==> java.lang.ClassCastException Object[] to String[] forbidden!!
    **/
    for (int i=0; i<collection.toArray().length; i++) {
      System.out.println(myArrayFromCollection[i]);
    }
    
    /** toArray(T[] t) **/
    //return a newly allocated array of T with all value in the collection. 
    String[] myArray = new String[3];
    collection.toArray(myArray);
  }
}
