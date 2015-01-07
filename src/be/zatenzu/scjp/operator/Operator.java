// $Id$
package be.zatenzu.scjp.operator;

public class Operator
{
  public static void main(String[] args)
  {
    /*************************************/
   /**      Operator +                  */
  /*************************************/
    //Add two numeric primitive
    int i = 1 + 1;
    
    //Concat String
    String s = "My" + " " + "String";
    
    int r = 4;
    int ff = 4;
    System.out.println("String" + r + ff);
    System.out.println("String" + ( r + ff ));
    //If the left or the rigth operator is a String, + will be a String concatenation
    //If both operands are numeric, + will be an addition operator
    
    /*************************************/
   /**      Operator =                  */
  /*************************************/
    //Assign a primitive value to a variable
    int ii = 4;
    
    //Assign a value to an object reference variable
    Object o = new Object();
    
    /*************************************/
   /**  Compound assignment operators   */
  /*************************************/
    //+=,-=,*=,/=

    /*************************************/
   /**  Relational operators            */
  /*************************************/
    //>,>=,<,<=,==,!=
    boolean b = false;
    if(b = false){System.out.println("false");}
    //The result of any assignment is the value of the variable after assignment !
    
    /** == with enum values **/
    //It's the same than equals()
    
    /*************************************/
   /**  Arithmetic operators            */
  /*************************************/    
    //+,-,/,*,%
    
    /*************************************/
   /**  Inc and Decrement operators     */
  /*************************************/
    int azerty = 4;
    //pre incr and decrementation
    System.out.println(++azerty);//incr first, print after
    System.out.println(--azerty);//desc first, print after
    
    //post incr and decrementation
    azerty = 4;
    System.out.println(azerty++);//print first, inc after
    System.out.println(azerty--);//print first, desc after
    
    /*************************************/
   /**  Logical operator                */
  /*************************************/
    //|| OR
    if(theTruth() || theTruth()){
      //Do something
    }
    //if the first operator is true, the second will not be evaluated
    
    //| OR
    if(theTruth() | theTruth()){
      //Do something
    }
    //The two operators are evalued
    
    //XOR ^
     System.out.println(true ^ true);//false
     System.out.println(true ^ false);//true
     System.out.println(false ^ true);//true
     System.out.println(false ^ false);//false
  }
  
  public static boolean theTruth(){
    System.out.println("Always true!");
    return true;
  }
}
