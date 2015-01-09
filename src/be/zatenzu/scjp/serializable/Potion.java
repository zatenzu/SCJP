// $Id$
package be.zatenzu.scjp.serializable;


public class Potion implements Expendable
{
  enum PotionType{HEAL, STAMINA, STRENGH, INTELLIGENCE}
  
  public String name;
  public PotionType type;
  
  public Potion(String name, PotionType type){
    this.name = name;
    this.type = type;
  }

  @Override
  public String toString()
  {
    String s = "[" + this.type + ":" + this.name + "]";
    return s;
  }
  
  
}
