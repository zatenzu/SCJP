// $Id$
package be.zatenzu.scjp.constructor;

public class SubClass extends Mother
{
  //Constructors are never inhertited
  
  //the auto-created constructor will:
  // -have the same access modifier than the calss
  // -no-args
  // -have as first line super();
  
  //compilator error because compilator want to insert super()
  //at the first line of this constructor but the default no-args Mother
  //constructor doesn't exist and he cannot add it because there is already
  //a constructor in the Mother class.
  protected SubClass(int i){
    System.out.println("SubClass constructor");
  }
  
  public SubClass(){
    this(1);//or super(1); must be the first line of the constructor body
    System.out.println("SubClass constructor");
  }
}
