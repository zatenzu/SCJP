// $Id$
package be.zatenzu.scjp.serializable;

public class WeaponImpl extends AbstractWeapon
{
  enum WeaponType{SWORD, AXE, STAFF, CROSSBOW, BOW};
  
  public String name;
  public WeaponType type;
  public int durability;
  public int maximumDurability;
  public int basicDomage;
  public int weight;
  
  public WeaponImpl(String name, WeaponType type, int durability, int maximumDurability, int basicDomage,int weight){
    this.name = name;
    this.type = type;
    this.durability = durability;
    this.maximumDurability = maximumDurability;
    this.basicDomage = basicDomage;
    this.weight = weight;
  }

  @Override
  public String toString()
  {
    String s = this.type + ":" + this.name + "\n";
    
    s+= "Dommage:" + this.basicDomage;
    s+= "Durability:" + this.durability + "/" + this.maximumDurability + "\n";
    s+="Weight:" + this.weight;
    
    return s;
  }
  
}
