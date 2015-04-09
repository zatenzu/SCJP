// $Id$
package be.zatenzu.scjp.constructor;

public class SubClass extends Mother
{
  //Constructors are never inhertited!
  //a sub class must have at least one constructor
  //with the same signature as a mother class constructor
  //excepted the default constructor
  
  //the auto-created(implicit default constructor) constructor will:
  // -have the same access modifier than the class
  // -no-args
  // -have as first line super();
  
  //if you define a constructor, the implicit
  //default constructor disappears!
  
  //compilator error because compilator want to insert super()
  //at the first line of this constructor but the default no-args Mother
  //constructor doesn't exist and he cannot add it because there is already
  //a constructor in the Mother class.
  protected SubClass(int i){
    System.out.println("SubClass constructor");
  }
  
  public SubClass(){
    this(Mother.getInt());//or super(1); must be the first line of the constructor body
    //the getInt() must be static!
    System.out.println("SubClass constructor");
  }
}
