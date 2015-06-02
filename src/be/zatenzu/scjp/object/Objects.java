// $Id$
package be.zatenzu.scjp.object;

public class Objects
{
  int i;
  float f;
  String s;
  
  public Objects(int i, float f, String s){
    this.i = i;
    this.f = f;
    this.s = s;
  }
  
  public static void main(String[] args)
  {
    /** Check the overridding rules for these methods!!! --> Big dumb trap! **/
    /** Exemple: String toString(){} -> it's not overriding !
      /*************************************/
     /**  public String toString()       **/
    /*************************************/
    System.out.println(new Objects(1, 3.4f, "String"));
    //=> be.zatenzu.scjp.object.Objects@134510ac
    //134510ac this is the hashcode
    //If the toString method isn't overridded

      /*************************************/
     /**public boolean equals(Object obj)**/
    /*************************************/
    /** equals rules:
     * Reflexive: instanceX.equals(instanceX) return always true!
     * Symmetric: if instanceX.equals(instanceY) return true, then instanceY.equals(instanceX) must return true
     * Transitive: if instanceX.equals(instanceY) return true and instanceX.equals(instanceZ) return true
     * then instanceY.equals(instanceX) must return true
     * Consistent: For instanceX and instanceY, multiple call of equals must return
     *  the same value if fields what are used in equals method aren't modified.
     * Null: instanceX.equals(null) return always false.
     * If equals isn't overridded, compare reference (==)
     */
    //Don't forget to use if(obj instanceof MyClass) ==> ClassCastException!
    
     /*************************************/
    /**   public int hashCode()         **/
   /*************************************/
    /** Rules:
     * - Consistent:For instanceX, multiple call of hashCode() must return
     *  the same value if fields what are used in hashCode() method aren't modified.
     * - If instanceX.equals(instanceY) return true, then instanceX.hashCode() == instanceY.hashCode()
     * - If instanceX.equals(instanceY) return false, then instanceX.hashCode() must be != instanceY.hashCode()
     */
    //hashCode isn't auto called by equals method!
    //hashCode is used by Collections, hashMap etc ...
    
    Objects o1 = new Objects(1, 3.4f, "String");
    Objects o2 = new Objects(1, 3.4f, "String");
    Objects o3 = new Objects(2, 3.4f, "String");
    if(o1.equals(o2)){
      System.out.println("o1 equals o2");
    }
    
  }

  @Override
  public int hashCode()
  {
    System.out.println("hashCode");
    return super.hashCode();
  }

  @Override
  public boolean equals(Object obj)
  {
    boolean equalsValue = false;
    if(obj != null){
      if(obj != this){
        if(obj instanceof Objects){
          Objects o = (Objects)obj;
          if(o.getI() == this.i &&
              o.getF() == this.f &&
              o.getS().equals(this.s)){
            equalsValue = true;
          }
        }
      }else{
        equalsValue = true;
      }
    }
    return equalsValue;
  }

  public int getI()
  {
    return i;
  }

  public void setI(int i)
  {
    this.i = i;
  }

  public float getF()
  {
    return f;
  }

  public void setF(float f)
  {
    this.f = f;
  }

  public String getS()
  {
    return s;
  }

  public void setS(String s)
  {
    this.s = s;
  }

//  @Override
//  public String toString()
//  {
//    // TODO Auto-generated method stub
//    return super.toString();
//  }
  
  
  
}
