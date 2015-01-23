// $Id$
package be.zatenzu.scjp.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import be.zatenzu.scjp.serializable.Character.CharacterState;
import be.zatenzu.scjp.serializable.Potion.PotionType;
import be.zatenzu.scjp.serializable.WeaponImpl.WeaponType;

public class Serializer implements Serializable
{
  //TODO: Serializable with inner class!
  
  /** See transient keyword **/
  
  /** RULES **/
  //- All objects must implement serializable or be a subtype of serializable object or be transient
  //==> java.io.NotSerializableException throws at the runtime. This is an IOException
  //private fields are serialized if they are not transient
  //no acces method is requiered
  
  /** See Character class **/
  public static void main(String[] args)
  {
    try{
      FileOutputStream fos = new FileOutputStream("c:\\serializeTest.txt");
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(buildCharacter());
      oos.flush();
      oos.close();
    }catch(IOException ioex){
      ioex.printStackTrace();
    }
    
    try{
      FileInputStream fis = new FileInputStream("c:\\serializeTest.txt");
      ObjectInputStream ois = new ObjectInputStream(fis);
      Character c = (Character)ois.readObject();
      System.out.println(c.toString());
    }catch(IOException ioex)
    {
      ioex.printStackTrace();
    }catch(ClassNotFoundException cnfe){}
    
  }
  
  private static Character buildCharacter(){
    Character c = new Character(1, "Leonard", 25, 25, "", CharacterState.TIRED);
    c.addObject(new WeaponImpl("Legendary Sword", WeaponType.SWORD, 55, 55, 125, 65));
    c.addObject(new Potion("Health potion", PotionType.HEAL));
    return c;
  }
  
  /** Output **/
  /*
  
  [Leonard- Level:1 -]
  State:TIRED <25/25>//--> State is correct writeObject and readObject work!
  null
  ----- Equipment -----
  -SWORD:Legendary Sword
  Dommage:125Durability:55/55
  Weight:65
  -[HEAL:Health potion]
  x=0//--> Transient field is rested to the default value (null for Object)
  ValueFromMySuperConstructor//--> !!!!
  */
  
  /**
   * When the object is desirialized, the constructor is not called!
   * So fields had the value that they had before the serialization
   * BUT: inherited fields from a nonserializable super class are set
   * by the super constructor!!!
   * Others super,.. super constructors are also called, of course!
   */
  
  /** If and collection or array is serialized, if one element is not serializable
   *  => java.io.NotSerializableException
   *  
   **/
}
